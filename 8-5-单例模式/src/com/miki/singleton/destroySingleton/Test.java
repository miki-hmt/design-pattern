package com.miki.singleton.destroySingleton;

import com.miki.singleton.hungrysingleton.HungrySingleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**【3】
 * 序列化和反序列化对单例的破坏
 * 示例：将单例对象存入文本文件，然后再从文本中读出来该对象
 */
public class Test {
    public static void main(String[] args) throws IOException {
        HungrySingleton instance = HungrySingleton.getInstance();

        System.out.println("#######################版本1");
        //v1 利用序列号和反序列化比较单例对象创建
        //将对象写入文件
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("G:\\work\\idea-workspace\\hungrySingleton"));
        oos.writeObject(instance);
        oos.close();

        //从文件读取对象
        File file = new File("G:\\work\\idea-workspace\\hungrySingleton");
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file));
        try {
            //将文件流转为对象
            HungrySingleton hungrySingleton = (HungrySingleton) ois.readObject();
            ois.close();
            System.out.println("源对象"+instance);
            System.out.println("新对象"+hungrySingleton);
            //查看是否相同
            System.out.println("二者是否相等："+(instance==hungrySingleton));


            System.out.println("#######################版本2");
            //v2
            /**
             * 解决序列化和反序列化造成单例的破坏，添加该方法，通过查看ObjectInputStream的readObject()方法的源码，可知，
             * readObject()会判断readResolve()是否存在该方法（ObjectStreamClass源码的949行代码），如果方法存在，
             * 则通过反射调用该方法获取单例对象并返回，否则通过反射获取新的单例实例化对象并返回。
             * 虽然此方法会返回正确的单例对象，但是还是会有实例化对象产生，只不过没返回而已。
             * @return
             */
            //v2
            //在HungrySingleton类中添加下面该方法
//            private Object readResolve(){
//                return hungrysingleton;
//            }


            System.out.println("#######################版本3");
            //v3
            //阻止饿汉模式下利用反射对单例模式的破坏
            Class objectClass = HungrySingleton.class;
            Constructor declaredConstructor = objectClass.getDeclaredConstructor();
            //设置允许访问私有构造方法的权限
            declaredConstructor.setAccessible(true);

            HungrySingleton singleton = HungrySingleton.getInstance();
            HungrySingleton singletonReflect = (HungrySingleton)declaredConstructor.newInstance();

            System.out.println("源对象"+singleton);
            System.out.println("新对象"+singletonReflect);
            //查看是否相同
            //将HungrySingleton中的私有构造方法中的防反射if(...)判断去掉，即可查看反射造成的单例化失败情景
            System.out.println("二者是否相等："+(singleton==singletonReflect));

        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }
    }
}

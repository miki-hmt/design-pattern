package com.miki.preventDestorySingleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**【4】
 * @ClassName Test
 * @Description 应用层伪代码模式，测试枚举类防止反射和多线程对单例的破坏
 * @Author miki
 * @Date 2020/2/16 16:17
 * @Version 1.0
 */
public class Test {
    public static void main(String[] args) {

        EnumInstance enumInstance = EnumInstance.getInstance();
        enumInstance.setData(new Object());
        //调用枚举对象中的方法
        enumInstance.printTest();


        System.out.println("#######################版本1");
        try {
            //v1 利用序列号和反序列化比较单例对象创建
            //将对象序列化入文件
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("G:\\work\\idea-workspace\\enumInstance"));
            oos.writeObject(enumInstance);
            oos.close();

            //从文件中反序列化出来该对象
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream("G:\\work\\idea-workspace\\enumInstance"));
            EnumInstance enumInstance1 = (EnumInstance) ois.readObject();

            System.out.println("源对象"+enumInstance.getData());
            System.out.println("新对象"+enumInstance1.getData());
            //查看是否相同
            System.out.println("二者是否相等："+(enumInstance.getData()==enumInstance1.getData()));



            System.out.println("############################################################版本2");
            //v2
            //阻止饿汉模式下利用反射对单例模式的破坏
            Class objectClass = EnumInstance.class;
            //获枚举类的有参取构造器
            Constructor declaredConstructor = objectClass.getDeclaredConstructor(String.class,int.class);
            //设置允许访问私有构造方法的权限
            declaredConstructor.setAccessible(true);

            /**
             * Enum枚举类 源码中的私有构造器
             */
//            protected Enum(String name, int ordinal) {
//                        this.name = name;
//                        this.ordinal = ordinal;
//                    }
            //根据Enum枚举类源码中的私有构造器，此处应该调用这样的newInstance(...)
            EnumInstance singletonReflect = (EnumInstance)declaredConstructor.newInstance("miki",666);

            System.out.println("源对象"+enumInstance);
            System.out.println("新对象"+singletonReflect);
            //查看是否相同
            //运行之后，报错，提示Exception in thread "main" java.lang.IllegalArgumentException: Cannot reflectively create enum objects
            //	at java.lang.reflect.Constructor.newInstance(Constructor.java:417)可以看出，枚举类是可以防御反射攻击单例的
            System.out.println("二者是否相等："+(enumInstance==singletonReflect));

        } catch (IOException | ClassNotFoundException | NoSuchMethodException | InstantiationException |
                IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}

package com.miki.singleton.hungrysingleton;

import java.io.Serializable;

/**【2】
 * 饿汉模式
 */
public class HungrySingleton implements Serializable {
    private final static HungrySingleton hungrysingleton = new HungrySingleton();

    private HungrySingleton(){
        //v3
        //阻止饿汉模式下利用反射对单例模式的破坏，在私有构造方法里加上异常抛出，此方法适用于单例对象一开始就已经创建好的饿汉模式
        if(null!=hungrysingleton){
            throw new RuntimeException("单例构造器禁止反射");
        }
    }

    public static HungrySingleton getInstance(){
        return hungrysingleton;
    }

    //v2
    /**
     * 解决序列化和反序列化造成单例的破坏，添加该方法，通过查看ObjectInputStream的readObject()方法的源码，可知，
     * readObject()会判断readResolve()是否存在该方法（ObjectStreamClass源码的949行代码），如果方法存在，
     * 则通过反射调用该方法获取单例对象并返回，否则通过反射获取新的单例实例化对象并返回。
     * 虽然此方法会返回正确的单例对象，但是还是会有实例化对象产生，只不过没返回而已。
     * @return
     */
    private Object readResolve(){
        return hungrysingleton;
    }

    //v3
    //阻止饿汉模式下利用反射对单例模式的破坏，在私有构造方法里加上异常抛出，此方法适用于单例对象一开始就已经创建好的饿汉模式
//    private HungrySingleton(){
//        if(null!=hungrysingleton){
//            throw new RuntimeException("单例构造器禁止反射");
//        }
//    }
}

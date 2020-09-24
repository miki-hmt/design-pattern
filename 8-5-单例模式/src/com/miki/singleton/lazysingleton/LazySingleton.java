package com.miki.singleton.lazysingleton;

/**【1】
 * 单例模式之懒汉模式
 * 意义：注重延迟加载，需要时创建，不需要时不创建
 * 缺点：多线程下需要加synchronize同步锁，对性能影响较大
 */
public class LazySingleton {

    private static LazySingleton lazySingleton = null;

    //创建私有构造函数，防止外部类使用new方法创建对象
    private LazySingleton(){

    }

    //v1
    //线程不安全方式
    public static LazySingleton getInstance(){
        if(lazySingleton==null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }

    //v2
    //线程安全方式
    //多线程下需要加synchronize同步锁，对性能影响较大
    public synchronized static LazySingleton getSafeInstance(){
        if(lazySingleton==null){
            lazySingleton = new LazySingleton();
        }
        return lazySingleton;
    }
}

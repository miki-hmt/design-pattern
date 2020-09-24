package com.miki.singleton.lazysingleton;

/**【1】
 * 单例模式之懒汉模式改进版（多线程安全+性能优化）
 * 意义：注重延迟加载，需要时创建，不需要时不创建
 */
public class LazyDoubleCheckSingleton {

    //要设置“volatile”标识符防止初始化对象重排序
    private volatile static LazyDoubleCheckSingleton lazyDoubleCheckSingleton = null;

    //创建私有构造函数，防止外部类使用new方法创建对象
    private LazyDoubleCheckSingleton(){

    }

    //v1
    //懒汉模式改进版，双重检测
    public static LazyDoubleCheckSingleton getInstance(){
        if(lazyDoubleCheckSingleton==null){
            synchronized (LazyDoubleCheckSingleton.class){
                if(lazyDoubleCheckSingleton==null){
                    lazyDoubleCheckSingleton = new LazyDoubleCheckSingleton();
                    //该行代码会执行下面三步：
                        //1.分配内存给这个对象
                        //2.初始化对象
                        //3.设置lazyDoubleCheckSingleton 指向刚分配的内存
                    // 注意：2和3步骤在多线程环境下可能会重排序，造成执行结果异常，所以要设置“volatile”标识符防止重排序
                    // 根据intra-thread semantics原则（单线程下允许重排序，不会影响执行结果，且能提高程序性能）
                }
            }
        }
        return lazyDoubleCheckSingleton;
    }
}

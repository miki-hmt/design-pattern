package com.miki.singleton.lazysingleton;


/**【1】
 * 应用层伪代码
 * 描述：使用多线程方式验证单例懒汉模式的线程不安全性
 */
public class Test {
    public static void main(String[] args) {

        //v1
        //单线程下正常创建
        //LazySingleton lazySingleton = LazySingleton.getInstance();

        //v2
        // 使用synchnronize同步锁保证线程安全,但较影响性能
        //LazySingleton safeLazySingleton = LazySingleton.getSafeInstance();

        //v3
        //使用“volatile+double check”保证线程安全，且性能较好
        //LazyDoubleCheckSingleton lazyDoubleCheckSingleton = LazyDoubleCheckSingleton.getInstance();

        //debug模式下调试多线程教程，去设计模式文档下查看
        Thread tt = new Thread(new TestThread());
        Thread tt1 = new Thread(new TestThread());
        tt.start();
        tt1.start();
    }
}

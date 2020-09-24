package com.miki.singleton.lazysingleton;

import com.miki.singleton.hungrysingleton.MongoDB.MongoDBUtil;
import com.miki.singleton.lazysingleton.v2.LazyDoubleCheckSingleton;

/**【1】
 * 测试多线程创建单例模式
 */
public class TestThread implements Runnable{
    @Override
    public void run() {
        //v1
        // 线程不安全
        LazySingleton lazySingleton = LazySingleton.getInstance();
        //System.out.println(Thread.currentThread().getName()+"  "+MongoDBUtil.getMongoDBDaoImplInstance().getMongoClient());
        System.out.println(Thread.currentThread().getName()+"  "+lazySingleton);

        //v2
        // 线程安全,较影响性能
        LazySingleton safeLazySingleton = LazySingleton.getSafeInstance();
        System.out.println(Thread.currentThread().getName()+"  "+safeLazySingleton);

        //v3
        //线程安全，且性能较好
        LazyDoubleCheckSingleton lazyDoubleCheckSingleton = LazyDoubleCheckSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+"  "+lazyDoubleCheckSingleton);
    }
}

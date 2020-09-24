package com.miki.singleton.threadlocalsinglen;

/**【7】
 * @ClassName ThreadLocalInstance
 * @Description TODO  利用ThreadLocal实现线程单例，从而实现单例
 * @Author miki
 * @Date 2020/2/21 22:05
 * @Version 1.0
 */
public class ThreadLocalInstance {

    private static final ThreadLocal<ThreadLocalInstance> threadLocalInstanceThreadLocal = new ThreadLocal<ThreadLocalInstance>(){
        @Override
        protected ThreadLocalInstance initialValue(){
            return new ThreadLocalInstance();
        }
    };

    //创建私有构造器
    private ThreadLocalInstance(){

    }

    public static ThreadLocalInstance getInstance(){
        return threadLocalInstanceThreadLocal.get();
    }

}

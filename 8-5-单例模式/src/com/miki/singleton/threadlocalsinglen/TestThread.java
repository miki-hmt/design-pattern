package com.miki.singleton.threadlocalsinglen;

/**【7】
 * @ClassName TestThread
 * @Description TODO 模拟多线程测试threadLocal
 * @Author miki
 * @Date 2020/2/21 22:11
 * @Version 1.0
 */
public class TestThread implements Runnable {
    @Override
    public void run() {
        ThreadLocalInstance threadLocalInstance = ThreadLocalInstance.getInstance();
        System.out.println(Thread.currentThread().getName()+" "+threadLocalInstance);
    }
}

package com.miki.singleton.threadlocalsinglen;

/**【7】
 * @ClassName App
 * @Description TODO    模拟应用层代码实现多线程调用threadLocal单例
 * @Author miki
 * @Date 2020/2/21 22:12
 * @Version 1.0
 */
public class App {
    public static void main(String[] args) {

        //1. 运行代码可知：ThreadLocal保证了在这一个线程里的对象的统一，下面三个mainThread得到的单例都是一个对象
        System.out.println("mainThread: "+ThreadLocalInstance.getInstance());
        System.out.println("mainThread: "+ThreadLocalInstance.getInstance());
        System.out.println("mainThread: "+ThreadLocalInstance.getInstance());


        //2. 但是，在不同的线程里，无法保证对象是同一个，下面两个thread创建的单例是不一样的
        Thread thread = new Thread(new TestThread());
        Thread thread1 = new Thread(new TestThread());

        thread.start();
        thread1.start();
    }
}

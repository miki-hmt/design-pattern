package com.miki.guavademo;

import com.google.common.eventbus.EventBus;

/**
 * @ClassName ThreadTest
 * @Description TODO 模拟多线程
 * @Author miki
 * @Date 2020/3/31 11:08
 * @Version 1.0
 */
public class ThreadTest implements Runnable{

    private int num;
    private EventBus bus;

    public ThreadTest(int num,EventBus bus) {
        this.num = num;
        this.bus = bus;
    }

    @Override
    public void run() {
        num +=10;
        bus.post(num);
        System.out.println("######当前线程名："+Thread.currentThread().getName()+"--"+num);
    }
}

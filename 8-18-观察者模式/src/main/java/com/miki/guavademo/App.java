package com.miki.guavademo;

import com.google.common.eventbus.EventBus;

/**
 * @ClassName App
 * @Description TODO guava观察者应用层模拟
 * @Author miki
 * @Date 2020/3/31 10:47
 * @Version 1.0
 */
public class App {

    public static void main(String[] args) {

        GuavaEvent guavaEvent = new GuavaEvent();
        //guava提供的观察者模式的核心类
        EventBus bus = new EventBus();
        int num = 5;
        bus.register(guavaEvent);
        //post:向所有已注册的订阅服务器发送事件。此方法将在事件发布到所有订阅服务器后成功返回，而不管订阅服务器引发的任何异常。
        // 如果没有订阅{@code event}的类，并且还不是{@link DeadEvent},它将被包装在一个DeadEvent中并重新发布
        bus.post(num);

        Thread tt = new Thread(new ThreadTest(num,bus));
        tt.start();
//        for (int i = 0; i < 10; i++) {
//            Thread tt = new Thread(new ThreadTest(num,bus));
//            tt.start();
//        }
    }
}

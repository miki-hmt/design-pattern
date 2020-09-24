package com.miki.guavademo;

import com.google.common.eventbus.AllowConcurrentEvents;
import com.google.common.eventbus.Subscribe;

/**
 * @ClassName GuavaEvent
 * @Description TODO guava中观察者模式的应用
 * @Author miki
 * @Date 2020/3/31 10:44
 * @Version 1.0
 */
public class GuavaEvent {

    @Subscribe
    @AllowConcurrentEvents  //线程安全
    public void subscribe(Object num){
        //业务逻辑
        //...
        //业务逻辑代码
        int anInt = Integer.parseInt(String.valueOf(num));
        System.out.println("执行subscribe方法，传入的参数是：["+this.toString()+"]"+anInt);
    }
}

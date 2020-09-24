package com.miki.adapter.objectadapter;

/**
 * @ClassName App
 * @Description TODO 模拟应用层代码模式适配器模式
 * @Author miki
 * @Date 2020/2/23 21:42
 * @Version 1.0
 */
public class App {

    public static void main(String[] args) {
        //v2
        //
        Target target = new ConcreteTargetImpl();
        target.request();

        Target adapterTarget = new Adapter();
        adapterTarget.request();

    }
}

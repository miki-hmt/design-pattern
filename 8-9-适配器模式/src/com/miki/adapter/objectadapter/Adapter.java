package com.miki.adapter.objectadapter;

/**
 * @ClassName Adapter
 * @Description TODO 对象适配器
 * @Author miki
 * @Date 2020/2/23 21:49
 * @Version 1.0
 */
public class Adapter implements Target{

    private Adaptee adaptee = new Adaptee();
    @Override
    public void request() {
        //业务逻辑代码实现
        //.....
        adaptee.adapteeRequest();
        //...
    }
}

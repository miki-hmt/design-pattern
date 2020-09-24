package com.miki.adapter.classadapter;

/**
 * @ClassName Adapter
 * @Description TODO
 * @Author miki
 * @Date 2020/2/23 21:39
 * @Version 1.0
 */
public class Adapter extends Adaptee implements Target{

    //
    @Override
    public void request() {
        //业务逻辑代码实现
        //.....
        super.adapteeRequest();
        //....
    }
}

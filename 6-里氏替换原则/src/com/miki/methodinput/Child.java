package com.miki.methodinput;

import java.util.HashMap;
import java.util.Map;

public class Child extends Base {

//    @Override
//    public void method(HashMap map) {
//        System.out.println("子类被执行...");
//    }

    //重载父类的方法
    //当子类的方法重载父类的方法时，方法的前置条件（即方法的输入/入参）要比父类的方法的输入参数更宽松。
    public void method(Map map) {
        System.out.println("方法重载被执行...");
    }
}

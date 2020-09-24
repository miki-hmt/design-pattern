package com.miki.methodinput;

import java.util.HashMap;
import java.util.Map;

public class Test {

    public static void main(String[] args) {

        //当子类的方法重载父类的方法时，方法的前置条件（即方法的输入/入参）要比父类的方法的输入参数更宽松。
        Child child = new Child();
        child.method(new HashMap());

        //v2
        System.out.println("*********************版本2");
        Base child2 = new Child();
        child2.method(new HashMap());
    }
}

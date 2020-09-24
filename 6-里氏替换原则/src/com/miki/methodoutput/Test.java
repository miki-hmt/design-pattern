package com.miki.methodoutput;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        //当子类的方法实现父类的方法时(重写/重载或实现抽象方法)，方法的后置条件(即方法的输出/返回值)要比父类更严格或相等。
        Child child =new Child();
        child.method();
    }
}

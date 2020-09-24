package com.miki.methodoutput;

import java.util.HashMap;

public class Child extends Base{


    @Override
    //2020.02.09 miki 当子类的方法实现父类的方法时(重写/重载或实现抽象方法)，方法的后置条件(即方法的输出/返回值)要比父类更严格或相等。
    //public Object method() {
    public HashMap method() {
        HashMap map = new HashMap();
        System.out.println("子类method被调用");
        map.put("message","子类method被调用");
        return map;
    }
}

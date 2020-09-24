package com.miki.decorater.v2;

/**
 * @ClassName Drink
 * @Description TODO 饮料实体类
 * @Author miki
 * @Date 2020/2/22 20:54
 * @Version 1.0
 */
public class Drink extends ADrink {

    //重写煎饼抽象类的描述方法
    @Override
    protected String getDesc() {
        return "威士忌";
    }

    //重写煎饼抽象类的价格方法
    @Override
    protected int cost() {
        return 8;
    }
}

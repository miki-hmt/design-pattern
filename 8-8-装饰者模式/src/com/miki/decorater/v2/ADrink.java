package com.miki.decorater.v2;

/**
 * @ClassName ADrink
 * @Description TODO装饰者模式，创建抽象饮料实体类
 * @Author miki
 * @Date 2020/2/22 20:47
 * @Version 1.0
 */
public abstract class ADrink {
    //获取饮料的相关信息的抽象方法
    protected abstract String getDesc();

    // 饮料价格的抽象方法
    protected abstract int cost();
}

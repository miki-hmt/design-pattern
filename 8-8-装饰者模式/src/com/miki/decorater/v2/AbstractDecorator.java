package com.miki.decorater.v2;

/**
 * @ClassName AbstractDecorator
 * @Description TODO 抽象装饰者类
 * @Author miki
 * @Date 2020/2/22 20:58
 * @Version 1.0
 */
public abstract class AbstractDecorator extends ADrink{

    private ADrink aDrink;

    //创建构造方法
    public AbstractDecorator(ADrink aDrink) {
        this.aDrink = aDrink;
    }

    protected abstract void doSomething();


    //重写抽象饮料类的描述方法
    @Override
    protected String getDesc() {
        return this.aDrink.getDesc();
    }

    @Override
    protected int cost() {
        return this.aDrink.cost();
    }
}

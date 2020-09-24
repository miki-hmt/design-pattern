package com.miki.decorater.v2;

/**
 * @ClassName SagarDecorator
 * @Description TODO 创建糖装饰者实体类
 * @Author miki
 * @Date 2020/2/22 21:01
 * @Version 1.0
 */
public class SagarDecorator extends AbstractDecorator{

    //重写装饰者抽象类的构造方法
    public SagarDecorator(ADrink aDrink) {
        super(aDrink);
    }

    //重写抽象装饰者的方法
    @Override
    protected void doSomething() {
        System.out.println("糖要冰糖");
    }

    @Override
    protected String getDesc() {
        return super.getDesc()+"-加一份糖";
    }

    @Override
    protected int cost() {
        return super.cost()+1;
    }
}

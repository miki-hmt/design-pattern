package com.miki.decorater.v2;

/**
 * @ClassName IceDecorator
 * @Description TODO  创建冰装饰者实体类
 * @Author miki
 * @Date 2020/2/22 21:01
 * @Version 1.0
 */
public class IceDecorator extends AbstractDecorator{

    //重写装饰者抽象类的构造方法
    public IceDecorator(ADrink aDrink) {
        super(aDrink);
    }

    @Override
    protected void doSomething() {
        System.out.println("冰要-5度的");
    }

    @Override
    protected String getDesc() {
        return super.getDesc()+"-加一份冰";
    }

    @Override
    protected int cost() {
        return super.cost()+1;
    }
}

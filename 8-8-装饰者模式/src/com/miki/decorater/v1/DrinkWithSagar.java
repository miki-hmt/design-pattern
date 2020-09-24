package com.miki.decorater.v1;

/**【1】非装饰者模式
 * @ClassName DrinkWithSagar
 * @Description TODO 非装饰者模式，实现饮料的多种类组合，加糖的饮料
 * @Author miki
 * @Date 2020/2/22 20:32
 * @Version 1.0
 */
public class DrinkWithSagar extends Drink{

    //重写父类的描述方法
    @Override
    public String getDesc() {
        return super.getDesc()+"-加糖";
    }

    //重写父类的价格方法
    @Override
    public int cost() {
        return super.cost()+1;
    }
}

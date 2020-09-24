package com.miki.decorater.v1;

/**【1】非装饰者模式
 * @ClassName DrinkWithSagarIce
 * @Description TODO  非装饰者模式，实现饮料的多种类组合，加糖加冰的饮料
 * @Author miki
 * @Date 2020/2/22 20:38
 * @Version 1.0
 */
public class DrinkWithSagarIce extends DrinkWithSagar{

    //重写父类的描述
    @Override
    public String getDesc() {
        return super.getDesc()+"-加冰";
    }

    @Override
    public int cost() {
        return super.cost()+1;
    }
}

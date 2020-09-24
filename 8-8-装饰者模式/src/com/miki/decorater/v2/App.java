package com.miki.decorater.v2;

/**
 * @ClassName App
 * @Description TODO
 * @Author miki
 * @Date 2020/2/22 21:12
 * @Version 1.0
 */
public class App {

    public static void main(String[] args) {
        ADrink aDrink;

        //先来一份饮料
        aDrink = new Drink();
        //突然想要加冰
        aDrink = new IceDecorator(aDrink);
        //不够凉，再加一份冰
        aDrink = new IceDecorator(aDrink);

        //突然想要加糖
        aDrink = new SagarDecorator(aDrink);
        //糖不够，再来一份糖
        aDrink = new SagarDecorator(aDrink);

        //满意了，结账
        System.out.println(aDrink.getDesc()+" 销售价格："+aDrink.cost());
    }
}

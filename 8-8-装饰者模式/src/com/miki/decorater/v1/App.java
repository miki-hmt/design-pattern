package com.miki.decorater.v1;

/**【1】非装饰者模式
 * @ClassName App
 * @Description TODO 模拟应用层代码实现
 * @Author miki
 * @Date 2020/2/22 20:39
 * @Version 1.0
 */
public class App {
    public static void main(String[] args) {
        //单点饮料价格
        Drink drink = new Drink();
        System.out.println(drink.getDesc()+" 销售价格："+drink.cost());

        //饮料+糖的价格
        DrinkWithSagar drinkWithSagar = new DrinkWithSagar();
        System.out.println(drinkWithSagar.getDesc()+" 销售价格："+drinkWithSagar.cost());

        //饮料+糖+冰的价格
        DrinkWithSagarIce drinkWithSagarIce = new DrinkWithSagarIce();
        System.out.println(drinkWithSagarIce.getDesc()+" 销售价格："+drinkWithSagarIce.cost());

        //v2
        //如果想要两份糖，或者两份冰的需求，当前的方法是无法满足的，就要用到装饰者模式来处理
        //备注：如果想单独把糖和冰提出来作为一个实体，增加数量的属性，那代码改动量就太大了。整体业务逻辑都要改写，不符合代码复用的开发规范。
    }
}

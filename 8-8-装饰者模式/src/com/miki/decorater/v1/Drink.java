package com.miki.decorater.v1;

/**【1】非装饰者模式
 * @ClassName Drink
 * @Description TODO  非装饰者模式，实现饮料的多种类组合， 创建一个实体，饮料实体
 * @Author miki
 * @Date 2020/2/22 20:16
 * @Version 1.0
 */
public class Drink {

    //获取饮料的相关信息
    protected String getDesc(){

        return "果汁";
    }

    // 饮料价格
    protected int cost(){
        return 15;
    }
}

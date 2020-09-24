package com.miki.strategy;

import com.miki.strategy.v2.PromotionStrategyFactory;

/**
 * @ClassName App
 * @Description TODO 促销活动应用层代码
 * @Author miki
 * @Date 2020/3/10 22:08
 * @Version 1.0
 */
public class App {
    public static void main(String[] args) {
        //v1
        //不采用策略模式的话，可能需要大量的if..else去判断各种活动的优惠情况
        /*if(price < 100){
            System.out.println("返现促销，返还的金额已存到慕课网账号的余额中");
        }else{
            if(price > 200 && price <900){
                price = price - 20;
                System.out.println("立减促销，课程的价格直接减去配置的价格");  //配置可以是db数据中的数据，可以是配置文件中的变量
            }else{
                System.out.println("满减促销，满900-300");
            }
        }*/

        //v2
        //天猫618立减活动
        PromotionActivity tm618 = new PromotionActivity(new LijianPromotionStrategy());
        //双十一满减活动
        PromotionActivity tm1111 = new PromotionActivity(new FanxianPromotionStrategy());
        tm1111.executePromotionStrategy();
        tm618.executePromotionStrategy();


        System.out.println("v3 ###################################");
        //v3
        //使用单例模式+工厂模式+策略模式优化策略模式
        String promotionType = "LIJIAN";
        String promotionType1 = "LIJIANxx";     //不存在的促销活动
        PromotionActivity tm618promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionType));
        PromotionActivity tm1111promotionActivity = new PromotionActivity(PromotionStrategyFactory.getPromotionStrategy(promotionType1));
        tm618promotionActivity.executePromotionStrategy();
        tm1111promotionActivity.executePromotionStrategy();
    }
}

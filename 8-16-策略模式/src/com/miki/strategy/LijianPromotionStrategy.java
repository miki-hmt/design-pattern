package com.miki.strategy;

/**
 * @ClassName LijianPromotionStrategy
 * @Description TODO  立减促销策略，买一个200元的课程，立减20，只需要180
 * @Author miki
 * @Date 2020/3/10 21:39
 * @Version 1.0
 */
public class LijianPromotionStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("立减促销，课程的价格直接减去配置的价格");  //配置可以是db数据中的数据，可以是配置文件中的变量
    }
}

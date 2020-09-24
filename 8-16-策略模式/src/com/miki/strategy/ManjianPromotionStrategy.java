package com.miki.strategy;

/**
 * @ClassName ManjianPromotionStrategy
 * @Description TODO  满减促销策略，购买课程满900，减300
 * @Author miki
 * @Date 2020/3/10 21:38
 * @Version 1.0
 */
public class ManjianPromotionStrategy implements PromotionStrategy{

    @Override
    public void doPromotion() {
        System.out.println("满减促销，满900-300");
    }
}

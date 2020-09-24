package com.miki.strategy;

/**
 * @ClassName FanxianPromotionStrategy
 * @Description TODO 返现促销策略，买一个100元的课程，返现20元
 * @Author miki
 * @Date 2020/3/10 21:40
 * @Version 1.0
 */
public class FanxianPromotionStrategy implements PromotionStrategy{

    @Override
    public void doPromotion() {
        System.out.println("返现促销，返还的金额已存到慕课网账号的余额中");
    }
}

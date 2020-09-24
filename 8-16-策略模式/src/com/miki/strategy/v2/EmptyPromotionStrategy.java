package com.miki.strategy.v2;

import com.miki.strategy.PromotionStrategy;

/**
 * @ClassName EmptyPromotionStrategy
 * @Description TODO
 * @Author miki
 * @Date 2020/3/10 22:33
 * @Version 1.0
 */
public class EmptyPromotionStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("无促销...");
    }
}

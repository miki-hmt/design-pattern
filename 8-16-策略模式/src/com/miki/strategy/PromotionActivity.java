package com.miki.strategy;

/**
 * @ClassName PromotionActivity
 * @Description TODO 促销活动类
 * @Author miki
 * @Date 2020/3/10 22:01
 * @Version 1.0
 */
public class PromotionActivity {

    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }

    public void executePromotionStrategy(){
        promotionStrategy.doPromotion();
    }
}

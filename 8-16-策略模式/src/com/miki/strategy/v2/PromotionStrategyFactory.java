package com.miki.strategy.v2;

import com.miki.strategy.FanxianPromotionStrategy;
import com.miki.strategy.LijianPromotionStrategy;
import com.miki.strategy.ManjianPromotionStrategy;
import com.miki.strategy.PromotionStrategy;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName PromotionStrategyFactory
 * @Description TODO 促销工厂
 * @Author miki
 * @Date 2020/3/10 22:23
 * @Version 1.0
 */
public class PromotionStrategyFactory {

    private static Map<String, PromotionStrategy> PROMOTION_STRATEGY_MAP = new HashMap<>();

    //定义一个内部接口存储全局变量
    private interface PromotionKey{
        String LIJIAN = "LIJIAN";
        String MANJIAN = "MANJIAN";
        String FANXIAN = "FANXIAN";
    }

    static{
        PROMOTION_STRATEGY_MAP.put(PromotionKey.LIJIAN,new LijianPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.MANJIAN,new ManjianPromotionStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.FANXIAN,new FanxianPromotionStrategy());
    }

    private static final PromotionStrategy NON_PROMOTION = new EmptyPromotionStrategy();

    private PromotionStrategyFactory(){

    }

    public static PromotionStrategy getPromotionStrategy(String promotionType){
        PromotionStrategy promotionStrategy = PROMOTION_STRATEGY_MAP.get(promotionType);
        return promotionStrategy==null ? NON_PROMOTION : promotionStrategy;
    }


}

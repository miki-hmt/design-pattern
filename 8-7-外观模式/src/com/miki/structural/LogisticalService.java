package com.miki.structural;

/**
 * @ClassName LogisticalService
 * @Description TODO 模拟物流派送服务业务逻辑代码
 * @Author miki
 * @Date 2020/2/22 12:50
 * @Version 1.0
 */
public class LogisticalService {

    //发送礼物快读
    public String sendGift(PointsGift gift){
        //物流逻辑对接
        System.out.println("快递名称："+gift.getName());
        //返回快递订单
        String order = "321545";
        return order;
    }
}

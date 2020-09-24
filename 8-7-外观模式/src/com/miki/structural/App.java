package com.miki.structural;

/**
 * @ClassName App
 * @Description TODO 应用层代码模拟积分兑换流程
 * @Author miki
 * @Date 2020/2/22 13:08
 * @Version 1.0
 */
public class App {

    public static void main(String[] args) {
        PointsGift gift = new PointsGift("茶杯");
        PointGiftExchangeService exchangeService = new PointGiftExchangeService();

        //实现外观模式，提供了一个统一的接口，用来访问子系统中的一群接口，通过setter方式注入子系统的相关接口
        exchangeService.setLogisticalService(new LogisticalService());
        exchangeService.setPointsPaymentService(new PointsPaymentService());
        exchangeService.setQualifyService(new QualifySerivce());

        exchangeService.giftExchange(gift);
    }


}

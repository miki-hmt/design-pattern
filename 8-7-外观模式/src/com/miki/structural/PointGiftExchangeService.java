package com.miki.structural;

/**
 * @ClassName PointGiftExchangeService
 * @Description TODO 积分礼物兑换服务接口，实现外观模式，提供了一个统一的接口，用来访问子系统中的一群接口
 * @Author miki
 * @Date 2020/2/22 12:56
 * @Version 1.0
 */
public class PointGiftExchangeService {

    //依赖子系统中的一群接口
    private PointsPaymentService pointsPaymentService;
    private QualifySerivce qualifyService;
    private LogisticalService logisticalService;


    //利用setter方式注入上面三种服务
    public void setPointsPaymentService(PointsPaymentService pointsPaymentService) {
        this.pointsPaymentService = pointsPaymentService;
    }
    public void setQualifyService(QualifySerivce qualifyService) {
        this.qualifyService = qualifyService;
    }
    public void setLogisticalService(LogisticalService logisticalService) {
        this.logisticalService = logisticalService;
    }

    //兑换服务
    public String giftExchange(PointsGift pointsGift){
        if(qualifyService.isAvariable(pointsGift)){
            //资格校验通过
            if(pointsPaymentService.pay(pointsGift)){
                //支付积分通过
                String orderNumber = logisticalService.sendGift(pointsGift);
                return orderNumber;
            }
        }
        return "兑换失败";
    }
}

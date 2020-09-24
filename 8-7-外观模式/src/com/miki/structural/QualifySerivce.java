package com.miki.structural;

/**【1】
 * @ClassName QualifySerivce
 * @Description TODO  业务层代码模拟，判断用户是否有资格兑换礼物。
 * @Author miki
 * @Date 2020/2/22 12:35
 * @Version 1.0
 */
public class QualifySerivce {

    //判断是否有资格兑换礼物的方法
    public Boolean isAvariable(PointsGift gift){

        System.out.println("校验"+gift.getName()+"积分资格通过");
        return true;
    }
}

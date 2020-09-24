package com.miki.proxy;

/**
 * @ClassName Order
 * @Description TODO    订单数据
 * @Author miki
 * @Date 2020/2/27 14:04
 * @Version 1.0
 */
public class Order {

    //关联用户id
    private Integer userId;
    private Object orderInfo;


    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Object getOrderInfo() {
        return orderInfo;
    }

    public void setOrderInfo(Object orderInfo) {
        this.orderInfo = orderInfo;
    }
}

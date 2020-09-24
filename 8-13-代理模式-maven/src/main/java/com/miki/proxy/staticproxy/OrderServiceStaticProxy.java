package com.miki.proxy.staticproxy;

import com.miki.proxy.IOrderService;
import com.miki.proxy.Order;
import com.miki.proxy.OrderServiceImpl;
import com.miki.proxy.db.DataSourceContextHolder;

/**
 * @ClassName OrderServiceStaticProxy
 * @Description TODO 为orderService使用静态代理方法进行增强，
 * @Author miki
 * @Date 2020/2/27 14:16
 * @Version 1.0
 */
public class OrderServiceStaticProxy {

    private IOrderService orderService;

    public int saveOrder(Order order){
        BeforeMethod(order);

        orderService = new OrderServiceImpl();
        int result = orderService.saveOrder(order);

        afterMethod();
        return result;
    }

    //静态代理before
    private void BeforeMethod(Order order) {

        Integer userId = order.getUserId();
        //获取db路由
        int dbRouter = userId % 2;  //对user进行取模，奇数进入A库，偶数进入B库
        System.out.println("静态代理分配到【db"+dbRouter);

        //todo 设置datasource
        DataSourceContextHolder.setDBType("db"+String.valueOf(dbRouter));

        System.out.println("静态代理 before code");
    }

    //静态代理before
    private void afterMethod() {
        System.out.println("静态代理 after code");
    }
}

package com.miki.proxy;

import com.miki.proxy.dynamicproxy.OrderServiceDynamicProxy;
import com.miki.proxy.staticproxy.OrderServiceStaticProxy;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * @ClassName App
 * @Description TODO    应用层代码实现
 * @Author miki
 * @Date 2020/2/27 20:14
 * @Version 1.0
 */
public class App {
    public static void main(String[] args) {

        Order order =new Order();
        order.setUserId(1);
        //v1
        //静态代理
        OrderServiceStaticProxy orderServiceStaticProxy = new OrderServiceStaticProxy();
        orderServiceStaticProxy.saveOrder(order);
        System.out.println("版本2：动态代理###################################");

        //v2
        //动态代理
        IOrderService orderServiceDynamicProxy = (IOrderService) new OrderServiceDynamicProxy(new OrderServiceImpl()).bind();
        orderServiceDynamicProxy.saveOrder(order);
    }
}

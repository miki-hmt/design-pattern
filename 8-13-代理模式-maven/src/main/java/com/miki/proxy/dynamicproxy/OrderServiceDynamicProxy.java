package com.miki.proxy.dynamicproxy;

import com.miki.proxy.Order;
import com.miki.proxy.db.DataSourceContextHolder;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @ClassName OrderServiceDynamicProxy
 * @Description TODO    orderservice的动态代理类
 * @Author miki
 * @Date 2020/2/29 16:58
 * @Version 1.0
 */
public class OrderServiceDynamicProxy implements InvocationHandler {

    private Object target;

    public OrderServiceDynamicProxy(Object target) {
        this.target = target;
    }


    public Object bind(){
        Class<?> targetClass = target.getClass();

        return Proxy.newProxyInstance(targetClass.getClassLoader(),targetClass.getInterfaces(),this);
    }

    //动态代理主调方法，不像静态代理中主调方法直接命名为业务方法，如OrderServiceStaticProxy类中的saveOrder()，
    // 无法适配其他业务场景，如抽奖，积分，收藏等等。  2020.02.29 miki
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object argObject = args[0];
        beforeMethod(argObject);

        Object object = method.invoke(target, args);

        afterMethod();
        return object;
    }


    private void beforeMethod(Object obj){
        int userId = 0;

        if(obj instanceof Order){
            Order order = (Order)obj;
            userId = order.getUserId();
        }

        //此处可以处理多种类型的实例     2020.02.29 miki
//        if(obj instanceof Gift){
//            Gift gift = (Gift)obj;
//            userId = gift.getUserId();
//        }

        //获取db路由
        int dbRouter = userId % 2;  //对user进行取模，奇数进入A库，偶数进入B库
        System.out.println("静态代理分配到【db"+dbRouter);

        //todo 设置datasource
        DataSourceContextHolder.setDBType("db"+String.valueOf(dbRouter));

        System.out.println("动态代理 before code");
    }

    //动态代理before
    private void afterMethod() {
        System.out.println("动态代理 after code");
    }
}

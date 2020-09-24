package com.miki.proxy;

/**
 * @ClassName OrderServiceImpl
 * @Description TODO
 * @Author miki
 * @Date 2020/2/27 14:12
 * @Version 1.0
 */
public class OrderServiceImpl implements IOrderService{

    private IOrderDao orderDao;

    @Override
    public int saveOrder(Order order) {

        //spring会自动注入dao，我们自己暂时new出来
        orderDao = new OrderDaoImpl();
        System.out.println("service业务层调用Dao层添加保存方法");
        return orderDao.insert(order);
    }
}

package com.miki.proxy;

/**
 * @ClassName OrderDaoImpl
 * @Description TODO
 * @Author miki
 * @Date 2020/2/27 14:08
 * @Version 1.0
 */
public class OrderDaoImpl implements IOrderDao{

    @Override
    public int insert(Order order) {
        System.out.println("dao层添加order成功");
        return 1;
    }
}

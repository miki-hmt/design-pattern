package com.miki.chainofresponsibility.demo2.interfaces;

/**
 * @ClassName Filter
 * @Description TODO
 * @Author miki
 * @Date 2020/8/12 14:30
 * @Version 1.0
 */
public interface Filter {
    /*
     * 第一步：新建接口Filter，建立过滤方法，doFilter()
     */
    public String doFilter(String msg);
}

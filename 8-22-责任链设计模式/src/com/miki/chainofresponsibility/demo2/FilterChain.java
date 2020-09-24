package com.miki.chainofresponsibility.demo2;

import com.miki.chainofresponsibility.demo2.interfaces.Filter;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName FilterChain
 * @Description TODO
 * @Author miki
 * @Date 2020/8/12 14:28
 * @Version 1.0
 */
/*2019.01.04	miki
 * 过滤连实现类，可以对多个过滤类进行增删改查
 */
public class FilterChain {

    private List<Filter> filters = new ArrayList<>();

    //添加责任链方法
    public void addFilter(Filter f) {
        this.filters.add(f);
    }

    //实现责任链过滤方法
    public String doFilter(String str) {
        String r = str;

        for (Filter f : filters) {
            r = f.doFilter(r);
        }

        return r;
    }
}
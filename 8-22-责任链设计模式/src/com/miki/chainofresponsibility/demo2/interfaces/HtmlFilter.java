package com.miki.chainofresponsibility.demo2.interfaces;

/**
 * @ClassName HtmlFilter
 * @Description TODO
 * @Author miki
 * @Date 2020/8/12 14:31
 * @Version 1.0
 */
/*
 * 第二步：建立接口实现类HtmlFilter过滤html标签元素，SensitiveFilter，分别实现不同的过滤方法，对应不同的过滤条件
 */
public class HtmlFilter implements Filter {


    @Override
    public String doFilter(String msg) {
        // TODO Auto-generated method stub
        //处理html标签
        String r=msg.replace("<", "[").replace(">", "]");
        return r;
    }

}
package com.miki.chainofresponsibility.demo2.interfaces;

/**
 * @ClassName SensitiveFilter
 * @Description TODO
 * @Author miki
 * @Date 2020/8/12 14:32
 * @Version 1.0
 */
/*
 * 第二步：建立接口实现类HtmlFilter过滤敏感词汇，SensitiveFilter，分别实现不同的过滤方法，对应不同的过滤条件
 */
public class SensitiveFilter implements Filter {

    @Override
    public String doFilter(String msg) {
        // TODO Auto-generated method stub
        //处理敏感字
        msg=msg.replace("被就业", "就业").replace("敏感", "");
        return msg;
    }

}

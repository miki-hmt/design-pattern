package com.miki.chainofresponsibility.demo2;

/**
 * Created by yuyu on 2017/7/5.
 */
public class SensitiveFilter implements Filter {

    public void doFilter(Request request, Response response, FilterChain chain) {

        System.out.println("SensitiveFilter 过滤内容  开始");

        //处理字符串中的敏感信息，将被就业和谐成就业
        request.requestStr = request.requestStr
                .replace("被就业", "就业").replace("敏感", "") +
                //后面添加的是便于我们观察代码执行步骤的字符串
                " ---sensitiveFilter()";
        chain.doFilter(request, response, chain);
        response.responseStr += "---sensitiveFilter()";

        System.out.println("SensitiveFilter 过滤内容  结束");
    }
}

package com.miki.chainofresponsibility.demo2;

/**
 * Created by yuyu on 2017/7/5.
 */
public class HTMLFilter implements Filter {

    public void doFilter(Request request, Response response, FilterChain chain) {
        System.out.println("HTMLFilter 过滤内容  开始");

        //将字符串中出现的"<>"符号替换成"[]"
        request.requestStr = request.requestStr
                .replace('<', '[').replace('>', ']') +
                //后面添加的是便于我们观察代码执行步骤的字符串
                "----HTMLFilter()";
        chain.doFilter(request, response, chain);
        response.responseStr += "---HTMLFilter()";

        System.out.println("HTMLFilter 过滤内容  结束");
    }
}

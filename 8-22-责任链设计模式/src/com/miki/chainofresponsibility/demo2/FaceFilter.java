package com.miki.chainofresponsibility.demo2;

/**
 * Created by yuyu on 2017/7/5.
 */
public class FaceFilter implements Filter {

    public void doFilter(Request request, Response response, FilterChain chain) {

        System.out.println("FaceFilter 过滤内容  开始");

        //将字符串中出现的":):"转换成"^V^";
        request.requestStr = request.requestStr.replace(":):", "^V^")
                //后面添加的是便于我们观察代码执行步骤的字符串
                + "----FaceFilter()";
        chain.doFilter(request, response, chain);
        response.responseStr += "---FaceFilter()";

        System.out.println("FaceFilter 过滤内容  结束");
    }
}

package com.miki.chainofresponsibility.demo2;

import com.miki.chainofresponsibility.demo2.interfaces.Filter;
import com.miki.chainofresponsibility.demo2.interfaces.HtmlFilter;
import com.miki.chainofresponsibility.demo2.interfaces.SensitiveFilter;


/*
 * 第三步：建立MsgProcessor处理类，按照一定的条件，顺序调用所有的过滤类，方法
 */
public class MsgProcessor {

	private static String msg;

	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}


	//调用多个拦截器进行字词筛选
	public static String process() {
		String r=msg;

		//2019.01.04	此处可以对所有的过滤条件进行排序，和添加，修改
		Filter[] filters= {new HtmlFilter(),new SensitiveFilter()};

		for(Filter f:filters) {
			r=f.doFilter(r);
		}
		return r;

	}

	public static void main(String[] args) {
		process();
	}
}

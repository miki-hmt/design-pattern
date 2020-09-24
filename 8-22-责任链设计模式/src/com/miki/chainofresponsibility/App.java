package com.miki.chainofresponsibility;

import com.miki.chainofresponsibility.demo2.MsgProcessor;

/**
 * @ClassName App
 * @Description TODO 应用层代码模拟：业务场景模拟：线上课程发布：要经过两个人审核批准，一个是手记检查人，一个是视频检查人
 * @Author miki
 * @Date 2020/4/1 10:54
 * @Version 1.0
 */
public class App {

    public static void main(String[] args) {
        ArticleApprover articleApprover = new ArticleApprover();
        VideoApprover videoApprover = new VideoApprover();

        Course course = new Course();
        course.setName("java设计模式精讲--by geely");
        course.setArticle("java设计模式精讲手记");
        course.setVideo("java设计模式精讲视频");

        articleApprover.setNextApprover(videoApprover);
        articleApprover.deploy(course);

        //######################################################## demo2
        /*2019.01.04	责任链模式
         *
         * 第一步：新建接口Filter，建立过滤方法，doFilter()
         * 第二步：建立接口实现类HtmlFilter，SensitiveFilter，分别实现不同的过滤方法，对应不同的过滤条件
         * 第三步：建立MsgProcessor处理类，按照一定的条件，顺序调用所有的过滤类，方法
         * 第四步：建立Main类，去调用MsgProcessor类的的处理方法
         *
         *
         * 总结：以后需要过滤不同类型的语句时，只需要新建实现类，继承Filter接口，实现对应的方法即可，然后将其添加到MsgProcessor方法中
         */
        String ms="大家好㉿，<script>，敏感，被就业，网络授课";

        MsgProcessor mp=new MsgProcessor();
        mp.setMsg(ms);
        String result = mp.process();
        System.out.println(result);


    }
}

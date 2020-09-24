package com.miki.observer;

/**
 * @ClassName App
 * @Description TODO 利用观察者模式，实现讲师回答学生提问问题的功能    【观察者：teacher    被观察者：course】
 * @Author miki
 * @Date 2020/3/18 21:31
 * @Version 1.0
 */
public class App {
    public static void main(String[] args) {

        Course course = new Course("java设计模式精讲");
        Teacher miki = new Teacher("miki");
        Teacher hmt = new Teacher("小黄狗");

        course.addObserver(miki);
        course.addObserver(hmt);

        //业务逻辑代码
        Question question = new Question();
        question.setUserName("黄晓梅");
        question.setQuestionContent("观察者模式如何理解？");

        course.produceQuestion(course,question);
    }

}

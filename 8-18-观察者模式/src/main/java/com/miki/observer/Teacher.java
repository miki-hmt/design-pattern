package com.miki.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @ClassName Teacher
 * @Description TODO 讲师  观察者：teacher    被观察者：course
 * @Author miki
 * @Date 2020/3/18 21:34
 * @Version 1.0
 */
public class Teacher implements Observer {

    private String teacherName;

    public Teacher(String teacherName) {
        this.teacherName = teacherName;
    }

    //重写更新方法
    @Override
    public void update(Observable o, Object arg) {
        //v2
        //ToDo 如果并发过高，同步会导致阻塞，可以采取两种方法：1.可以改成异步的    2.将内容放到消息队列中

        //v1
        Course course = (Course)o;
        Question question = (Question) arg;

        System.out.println(teacherName+"老师的"+course.getCourseName()+"课程接收到一个"+
                question.getUserName()+"提交的问答："+question.getQuestionContent());
    }
}

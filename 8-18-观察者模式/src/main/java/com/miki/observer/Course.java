package com.miki.observer;

import java.util.Observable;

/**
 * @ClassName Course
 * @Description TODO 课程
 * @Author miki
 * @Date 2020/3/18 21:31
 * @Version 1.0
 */
public class Course extends Observable {

    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }
    public String getCourseName() {
        return courseName;
    }

    public void produceQuestion(Course course,Question question){
        System.out.println(question.getUserName()+"在"+course.getCourseName()+"提交了一个问题");
        //状态发生改变
        setChanged();
        //将问题传递给观察者
        notifyObservers(question);
    }
}

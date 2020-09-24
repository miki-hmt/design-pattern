package com.miki.dependenceinversion.main;

import com.miki.dependenceinversion.ICourse;

/**
 * 2020.0207
 * 应用层的高层模块
 */
public class Miki {

    public Miki(){}

    //v1
    //************************************************
    public void studyJavaCourse(){
        System.out.println("miki在学习java课程");
    }
    public void studyWebCourse(){
        System.out.println("miki在学习前端课程");
    }
    public void studyPythonCourse(){
        System.out.println("miki在学习Python课程");
    }
    //************************************************

    //v2  通过接口方法的方式来注入具体的实现
    //************************************************
    public void studyCourse(ICourse course){
        course.studyCourse();
    }

    //v3  通过构造器方式注入miki里的具体实现
    //***********************************************
    private ICourse icourse;

    public Miki(ICourse course){
        this.icourse = course;
    }
    public void studyCourse(){
        icourse.studyCourse();
    }

    //v4  通过setter方式注入miki里的具体实现
    //***********************************************
    public void setIcourse(ICourse icourse) {
        this.icourse = icourse;
    }
}

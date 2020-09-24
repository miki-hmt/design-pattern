package com.miki.dependenceinversion.main;

import com.miki.dependenceinversion.JavaCourse;
import com.miki.dependenceinversion.PythonCourse;
import com.miki.dependenceinversion.WebCourse;

public class Test {

    public static void main(String[] args) {

        //v1
        System.out.println("*********************版本1");
        Miki miki = new Miki();

        miki.studyJavaCourse();
        miki.studyPythonCourse();
        miki.studyWebCourse();

        //**************************************************************
        //java中实现依赖注入的三种方法
        //**************************************************************

        //v2 通过接口注入方法的方式来注入具体的实现
        System.out.println("*********************版本2");
        miki.studyCourse(new JavaCourse());
        miki.studyCourse(new PythonCourse());
        miki.studyCourse(new WebCourse());

        //v3 通过构造器方式注入miki里的具体实现
        System.out.println("*********************版本3");
        Miki miki1 = new Miki(new JavaCourse());
        miki1.studyCourse();


        //v4 通过setter方式注入miki里的具体实现
        System.out.println("*********************版本4");
        miki.setIcourse(new JavaCourse());
        miki.studyCourse();

        miki.setIcourse(new PythonCourse());
        miki.studyCourse();
    }
}

package com.miki.dependenceinversion;

public class JavaCourse implements ICourse {

    @Override
    public void studyCourse() {
        System.out.println("miki正在学习java课程");
    }
}

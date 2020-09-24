package com.miki.dependenceinversion;

public class WebCourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("miki正在学习web课程");
    }
}

package com.miki.dependenceinversion;

public class PythonCourse implements ICourse{
    @Override
    public void studyCourse() {
        System.out.println("miki正在学习Python课程");
    }
}

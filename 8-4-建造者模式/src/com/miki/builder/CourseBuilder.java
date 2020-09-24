package com.miki.builder;

/**
 * 课程类的抽象建造者
 */
public abstract class CourseBuilder {

    public abstract void buildCourseName(String courseName);
    public abstract void buildCoursePPT(String coursePPT);
    public abstract void buildCourseVideo(String courseVideo);
    public abstract void buildCourseArticle(String courseArticle);
    public abstract void buildCourseQA(String courseQA);

    public abstract Course makeCourse();

    //如果的子类没有实现抽象父类中的所有抽象方法，那么子类也必须定义为abstract类型，接口（interface）
    //public abstract Course deleteCourse();
}

package com.miki.iterator;

/**
 * @ClassName CourseAggregate
 * @Description TODO 课程处理接口
 * @Author miki
 * @Date 2020/3/1 23:20
 * @Version 1.0
 */
public interface CourseAggregate {

    void addCourse(Course course);

    void removeCourse(Course course);

    //获得课程的迭代器
    CourseIterator getCourseIterator();
}

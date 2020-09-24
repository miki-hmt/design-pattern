package com.miki.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName CourseAggregateImpl
 * @Description TODO Course总数统计接口实现
 * @Author miki
 * @Date 2020/3/1 23:24
 * @Version 1.0
 */
public class CourseAggregateImpl implements CourseAggregate{

    private List courseList;
    //有参构造方法
    public CourseAggregateImpl() {
        this.courseList = new ArrayList();
    }

    @Override
    public void addCourse(Course course) {
        courseList.add(course);
    }

    @Override
    public void removeCourse(Course course) {
        courseList.remove(course);
    }

    @Override
    public CourseIterator getCourseIterator() {
        return new CourseIteratorImpl(courseList);
    }
}

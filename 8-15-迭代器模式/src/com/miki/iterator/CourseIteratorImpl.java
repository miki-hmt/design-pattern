package com.miki.iterator;

import java.util.List;

/**
 * @ClassName CourseIteratorImpl
 * @Description TODO 课程迭代器的接口实现类
 * @Author miki
 * @Date 2020/3/1 23:27
 * @Version 1.0
 */
public class CourseIteratorImpl implements CourseIterator{

    private List courseList;
    int position;
    Course course;

    public CourseIteratorImpl(List courseList) {
        this.courseList = courseList;
    }

    //获取下一个课程
    @Override
    public Course nextCourse() {
        System.out.println("返回课程，位置是："+position);
        course = (Course)courseList.get(position);
        position++;

        return course;
    }

    //判断课程是否是最后一个
    @Override
    public boolean isLastCourse() {
        if(position<courseList.size()){
            return false;
        }
        return true;
    }
}

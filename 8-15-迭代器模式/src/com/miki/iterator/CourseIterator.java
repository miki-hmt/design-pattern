package com.miki.iterator;

/**
 * @ClassName CourseIterator
 * @Description TODO 课程迭代器接口
 * @Author miki
 * @Date 2020/3/1 23:23
 * @Version 1.0
 */
public interface CourseIterator {

    Course nextCourse();

    boolean isLastCourse();
}

package com.miki.iterator;

import java.util.ArrayList;

/**
 * @ClassName App
 * @Description TODO 课程计数的应用层代码模拟
 * @Author miki
 * @Date 2020/3/1 23:33
 * @Version 1.0
 */
public class App {

    public static void main(String[] args) {
        Course course1 = new Course("java电商一期");
        Course course2 = new Course("java电商二期");
        Course course3 = new Course("java设计模式精讲");
        Course course4 = new Course("python课程");
        Course course5 = new Course("算法课程");
        Course course6 = new Course("前端课程");


        CourseAggregate courseAggregate = new CourseAggregateImpl();

        courseAggregate.addCourse(course1);
        courseAggregate.addCourse(course2);
        courseAggregate.addCourse(course3);
        courseAggregate.addCourse(course4);
        courseAggregate.addCourse(course5);
        courseAggregate.addCourse(course6);

        System.out.println("-----课程列表-----");
        printCourse(courseAggregate);

        courseAggregate.removeCourse(course4);
        courseAggregate.removeCourse(course5);

        System.out.println("-----删除之后的课程列表-----");
        printCourse(courseAggregate);

    }

    public static void printCourse(CourseAggregate courseAggregate){
        CourseIterator courseIterator = courseAggregate.getCourseIterator();
        while (!courseIterator.isLastCourse()){
            Course course = courseIterator.nextCourse();
            System.out.println("课程名："+course.getName());
        }
    }
}

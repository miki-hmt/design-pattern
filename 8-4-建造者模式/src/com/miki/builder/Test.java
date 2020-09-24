package com.miki.builder;
/**
 *@Author miki
 *@Description //TODO 模拟应用层代码实现建造者模式，应用层代码：通过CourseBuilder创建复杂课程对象，省区要不停的set大量的属性
 *@Date 2020/2/25 22:22
 *@Param
 *@Return
 *@Version 1.0
 */
public class Test {

    public static void main(String[] args) {
        CourseBuilder courseBuilder = new CourseActualBuilder();
        Coach coach = new Coach();
        coach.setCourseBuilder(courseBuilder);
        Course course = coach.makeCourse("java设计模式精讲", "java设计模式精讲ppt", "java设计模式精讲视频", "java设计模式精讲手记", "java设计模式精讲问答");

        System.out.println(course);
    }
}

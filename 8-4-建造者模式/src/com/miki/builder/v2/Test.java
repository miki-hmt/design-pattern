package com.miki.builder.v2;

public class Test {

    public static void main(String[] args) {
        Course course = new Course.CourseBuilder().buildCourseName("java设计模式精讲").buildcourseArticle("java设计模式精讲手记")
                .buildcoursePPT("java设计模式精讲PPT").buildcourseQA("java设计模式精讲问答").buildcourseVideo("java设计模式精讲视频").build();
        System.out.println(course);
    }
}

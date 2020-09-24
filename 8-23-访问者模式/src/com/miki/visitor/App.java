package com.miki.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName App
 * @Description TODO 应用层代码模拟
 * @Author miki
 * @Date 2020/4/1 14:48
 * @Version 1.0
 */
public class App {

    public static void main(String[] args) {
        List<Course> courseList = new ArrayList<>();

        FreeCourse freeCourse = new FreeCourse();
        freeCourse.setName("springMvc数据绑定");

        CodingCourse codingCourse = new CodingCourse();
        codingCourse.setName("java设计模式精讲：");
        codingCourse.setPrice(299);

        courseList.add(freeCourse);
        courseList.add(codingCourse);

        for (Course course : courseList) {
            //accept是抽象父类的公共方法
            course.accept(new Visitor());
        }
    }
}

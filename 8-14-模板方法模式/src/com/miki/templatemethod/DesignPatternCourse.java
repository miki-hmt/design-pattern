package com.miki.templatemethod;

/**
 * @ClassName DesignPatternCourse
 * @Description TODO 设计模式课程实体类，可变行为是：需要提供java源代码
 * @Author miki
 * @Date 2020/2/29 21:20
 * @Version 1.0
 */
public class DesignPatternCourse extends ACourse{

    @Override
    void packageCourse() {
        System.out.println("提供课程java源代码");
    }
}

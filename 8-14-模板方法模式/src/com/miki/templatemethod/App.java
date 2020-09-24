package com.miki.templatemethod;

/**
 * @ClassName App
 * @Description TODO 应用层代码模拟
 * @Author miki
 * @Date 2020/2/29 21:24
 * @Version 1.0
 */
public class App {

    public static void main(String[] args) {
        System.out.println("后端设计模式课程start---");
        ACourse course = new DesignPatternCourse();
        course.makeCourse();
        System.out.println("后端设计模式课程end---");

        System.out.println("前端设计模式课程start---");
        ACourse fecourse= new FECourse();
        fecourse.makeCourse();
        System.out.println("前端设计模式课程end---");

        System.out.println("版本2###############################################");
        //v2
        //需求：假如需要控制前端课程中的vue，react不用写手记，但是ext需要写手记，这个时候需要将权限适当赋给应用层一部分
        System.out.println("前端vue设计模式课程start---");
        ACourse vuecourse= new FECourse(true);
        vuecourse.makeCourse();
        System.out.println("前端vue设计模式课程end---");

    }
}

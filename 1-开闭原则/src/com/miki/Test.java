package com.miki;

public class Test {
    public static void main(String[] args) {

        ICourse javaCourse = new JavaDiscountCourse(96,"java从零到企业级电商开发",348d);

        JavaDiscountCourse discountCourse = (JavaDiscountCourse) javaCourse;
        System.out.println("课程ID："+javaCourse.getId()+"课程名称："+javaCourse.getName()+"课程打折价格："+javaCourse.getPrice()+
                "课程原价"+discountCourse.getOriginPrice());

        ICourse course = getJavaCourse();
        System.out.println("课程ID："+course.getId()+"课程名称："+course.getName()+"课程打折价格："+course.getPrice()+
                "课程原价"+discountCourse.getOriginPrice());
    }

    private static ICourse getJavaCourse() {
        return new JavaDiscountCourse(96,"java从零到企业级电商开发",348d);
    }

}

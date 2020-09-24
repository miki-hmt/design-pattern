package com.miki.composite;

/**
 * @ClassName Course
 * @Description TODO 课程实体组件
 * @Author miki
 * @Date 2020/2/24 21:32
 * @Version 1.0
 */
public class Course extends CatalogComponent{

    private String name;
    private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }

    //重写相关方法
    @Override
    public String getName(CatalogComponent catalogComponent) {
        return this.name;
    }

    @Override
    public double getPrice(CatalogComponent catalogComponent) {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println("Course Name："+this.name+" Course Price："+this.price);
    }
}

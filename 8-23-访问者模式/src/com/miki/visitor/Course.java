package com.miki.visitor;

/**
 * @ClassName Course
 * @Description TODO 课程抽象类
 * @Author miki
 * @Date 2020/4/1 14:36
 * @Version 1.0
 */
public abstract class Course {

    private String name;

    public abstract void accept(IVisitor iVisitor);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

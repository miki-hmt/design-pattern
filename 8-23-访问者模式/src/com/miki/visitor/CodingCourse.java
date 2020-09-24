package com.miki.visitor;

/**
 * @ClassName CodingCourse
 * @Description TODO 收费代码课程
 * @Author miki
 * @Date 2020/4/1 14:37
 * @Version 1.0
 */
public class CodingCourse extends Course{
    private int price;

    @Override
    public void accept(IVisitor iVisitor) {
        iVisitor.visit(this);
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

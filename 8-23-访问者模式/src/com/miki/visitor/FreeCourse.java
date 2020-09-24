package com.miki.visitor;

/**
 * @ClassName FreeCourse
 * @Description TODO 免费课程，没有价格参数
 * @Author miki
 * @Date 2020/4/1 14:39
 * @Version 1.0
 */
public class FreeCourse extends Course{

    @Override
    public void accept(IVisitor iVisitor) {
        iVisitor.visit(this);
    }
}

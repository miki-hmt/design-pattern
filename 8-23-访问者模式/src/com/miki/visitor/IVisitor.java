package com.miki.visitor;

/**
 * @ClassName IVisitor
 * @Description TODO 访问者接口
 * @Author miki
 * @Date 2020/4/1 14:35
 * @Version 1.0
 */
public interface IVisitor {

    void visit(FreeCourse freeCourse);

    void visit(CodingCourse codingCourse);
}

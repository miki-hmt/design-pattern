package com.miki.chainofresponsibility;

/**
 * @ClassName Approver
 * @Description TODO 视频批准/审核者
 * @Author miki
 * @Date 2020/4/1 10:57
 * @Version 1.0
 */
public abstract class Approver {

    //责任链模式核心：里面要声明一个和自己是同样类型的（批准者）对象
    //使用protected，为了让子类获取到该对象
    protected Approver approver;

    //setter注入
    public void setNextApprover(Approver approver) {
        this.approver = approver;
    }

    //发布方法
    //由子类实现，声明为抽象方法
    public abstract void deploy(Course course);

    protected String print(String msg){
        System.out.println(msg);
        return null;
    }
}

package com.miki.flyweight;

/**
 * @ClassName Manager
 * @Description TODO 实现员工的接口，部门管理层实体
 * @Author miki
 * @Date 2020/2/24 13:00
 * @Version 1.0
 */
public class Manager implements Employee{
    //所在部门
    private String dePartment;
    //报告内容
    private String reportContent;

    @Override
    public void report() {
        System.out.println(" "+reportContent);
    }

    //创建一个含参构造器
    public Manager(String dePartment) {
        this.dePartment = dePartment;
    }

    //创建一个setter注入department属性
    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }
}

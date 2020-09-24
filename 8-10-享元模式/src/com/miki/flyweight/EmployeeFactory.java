package com.miki.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName EmployeeFactory
 * @Description TODO 创建员工的工厂类，通过容器单例来实现享元模式节约内存空间，提高系统性能
 * @Author miki
 * @Date 2020/2/24 13:05
 * @Version 1.0
 */
public class EmployeeFactory {

    //使用容器单例模式实现享元模式，享元模式是对象级别的，可以有多个对象实例，多个变量引用同一个对象实例；所以不用考虑线程安全问题
    private static final Map<String,Employee> EMPLOYEE_MAP = new HashMap<String,Employee>();

    public static Employee getManager(String department){
        Manager manager = (Manager)EMPLOYEE_MAP.get(department);
        if(manager==null){
            manager = new Manager(department);
            System.out.print("创建部门经理："+department);
            String reportContent = "部门汇报：此次汇报内容是...";
            manager.setReportContent(reportContent);
            System.out.println(" 创建报告："+reportContent);
            EMPLOYEE_MAP.put(department,manager);

        }
        return manager;
    }
}

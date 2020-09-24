package com.miki.flyweight;

/**
 * @ClassName App
 * @Description TODO 模拟公司管理层做年终报告的功能应用层实现
 * @Author miki
 * @Date 2020/2/24 13:11
 * @Version 1.0
 */
public class App {

    private static final String departments[]  = {"测试部","研发部","人事部","应用事业部"};
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            String department = departments[(int)(Math.random()*departments.length)];   //模拟随机数字0~3
            Employee manager = EmployeeFactory.getManager(department);
            manager.report();
        }
    }
}

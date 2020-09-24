package com.miki.bridge;

/**
 * @ClassName Bank
 * @Description TODO 银行抽象类
 * @Author miki
 * @Date 2020/2/26 23:06
 * @Version 1.0
 */
public abstract class Bank {
    //创建一个protected类型的变量，只允许同一个包内访问
    protected Account account;

    //增加构造方法
    public Bank(Account account) {
        this.account = account;
    }

    //建立一个抽象方法，实现桥接模式的 抽象 和 实现 分离
    abstract Account openAccount();
}

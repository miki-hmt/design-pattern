package com.miki.mediator;

/**
 * @ClassName App
 * @Description TODO 模拟应用层代码
 * @Author miki
 * @Date 2020/3/31 23:23
 * @Version 1.0
 */
public class App {

    public static void main(String[] args) {

        User miki = new User("miki");
        User user = new User("小黄狗");

        miki.sendMessage("嗨，小黄，让我们愉快的爱爱吧");
        user.sendMessage("ok,洗白白等我吧");
    }
}

package com.miki.mediator;

/**
 * @ClassName User
 * @Description TODO 用户实体
 * @Author miki
 * @Date 2020/3/31 23:18
 * @Version 1.0
 */
public class User {

    private String name;

    public User(String name) {
        this.name = name;
    }

    //中介者模式方法核心
    public void sendMessage(String message){
        StudyGroup.showMessage(this,message);
    }

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
}

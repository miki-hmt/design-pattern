package com.miki.mediator;

import java.util.Date;

/**
 * @ClassName StudyGroup
 * @Description TODO 学习群实体，角色：中介者
 * @Author miki
 * @Date 2020/3/31 23:19
 * @Version 1.0
 */
public class StudyGroup {

    public static void showMessage(User user,String message){
        System.out.println(new Date().toString()+" ["+user.getName()+"]: "+message);
    }

    //TODO 消息脱敏
    //TODO 消息敏感字检查，都可以在中介者中间进行设计
}

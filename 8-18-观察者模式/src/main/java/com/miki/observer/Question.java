package com.miki.observer;

/**
 * @ClassName Question
 * @Description TODO 问题类
 * @Author miki
 * @Date 2020/3/18 21:32
 * @Version 1.0
 */
public class Question {

    private String userName;
    private String questionContent;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getQuestionContent() {
        return questionContent;
    }

    public void setQuestionContent(String questionContent) {
        this.questionContent = questionContent;
    }
}

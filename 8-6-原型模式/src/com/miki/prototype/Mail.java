package com.miki.prototype;

import java.util.Date;

/**【1】
 * @ClassName Mail
 * @Description TODO    创建邮件实体,非原型模式
 * @Author miki
 * @Date 2020/2/21 22:39
 * @Version 1.0
 */
public class Mail {

    private String name;
    private String emailAddress;
    private String content;
    private Date sendDate;

    public Mail(){
        System.out.println("调用了mail的构造方法");
    }

    @Override
    public String toString() {
        return "Mail{" +
                "name='" + name + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", econtent='" + content + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getSendDate() {
        return sendDate;
    }

    public void setSendDate(Date sendDate) {
        this.sendDate = sendDate;
    }
}

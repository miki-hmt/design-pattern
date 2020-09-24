package com.miki.prototype.v2;

import java.util.Date;

/**【2】
 * @ClassName Mail
 * @Description TODO
 * @Author miki
 * @Date 2020/2/21 23:09
 * @Version 1.0
 */
public class Mail implements Cloneable{
    private String name;
    private String emailAddress;
    private String content;
    private Date sendDate;


    //v2 重写克隆方法，实现原型模式
    @Override
    protected Object clone() throws CloneNotSupportedException {
        System.out.println("克隆了该邮件对象");
        //v2
        //浅克隆
        Mail mail = (Mail)super.clone();

        //v3
        //深克隆,附带其他的属性类也要clone出来
        if(null!=mail.sendDate){
            mail.sendDate = (Date) mail.sendDate.clone();
            System.out.println("克隆了该时间对象");
        }

        return mail;
    }


    public Mail(){
        System.out.println("调用了mail的构造方法");
    }

    @Override
    public String toString() {
        return "Mail{" +
                "name='" + name + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", content='" + content + '\'' +
                ", sendDate=" + sendDate +
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

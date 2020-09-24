package com.miki.prototype.v2;

import com.miki.prototype.MailUtil;

import java.util.Date;

/**【2】
 * @ClassName App
 * @Description TODO 模拟原型模式应用层代码
 * @Author miki
 * @Date 2020/2/21 22:50
 * @Version 1.0
 */
public class App {
    public static void main(String[] args) throws CloneNotSupportedException {

        //v1
        //简单的发送多邮件，但是不能保存邮件最初的模板
        com.miki.prototype.Mail mail = new com.miki.prototype.Mail();
        mail.setContent("初始化模板");

        for (int i = 0; i <10 ; i++) {
            mail.setName("姓名"+i);
            mail.setEmailAddress("姓名"+i+"@qq.com");
            mail.setContent("恭喜您，此次抽中QQ会员大礼包！！");

            MailUtil.sendMail(mail);
        }
        MailUtil.saveOriginMailRecord(mail);
        System.out.println("v2###########################################################");

        //v2 浅克隆
        //利用原型模式，实现浅克隆，只克隆该类，其他依赖的类不克隆,比如日期对象，改变日期之后，所有的克隆对象的日期属性都会改变
        Mail ptmail = new Mail();
        ptmail.setSendDate(new Date());
        ptmail.setContent("初始化模板");

        for (int i = 0; i <10 ; i++) {
            Mail clone = (Mail)ptmail.clone();
            clone.setName("姓名"+i);
            clone.setEmailAddress("姓名"+i+"@qq.com");
            clone.setContent("恭喜您，此次抽中QQ会员大礼包！！");

            PTMailUtil.sendMail(clone);
        }

        PTMailUtil.saveOriginMailRecord(ptmail);

        //v3 深克隆
        // 详细方法见v2.mail的clone()方法扩展
    }
}

package com.miki.prototype;

import com.miki.prototype.v2.PTMailUtil;

/**【1】
 * @ClassName App
 * @Description TODO 模拟原型模式应用层代码
 * @Author miki
 * @Date 2020/2/21 22:50
 * @Version 1.0
 */
public class App {
    public static void main(String[] args) {

        //v1
        //简单的发送多邮件，但是不能保存邮件最初的模板
        Mail mail = new Mail();
        mail.setContent("初始化模板");

        for (int i = 0; i <10 ; i++) {
            mail.setName("姓名"+i);
            mail.setEmailAddress("姓名"+i+"@qq.com");
            mail.setContent("恭喜您，此次抽中QQ会员大礼包！！");

            MailUtil.sendMail(mail);
        }

        MailUtil.saveOriginMailRecord(mail);


        //v2
        //利用原型模式，实现克隆

    }
}

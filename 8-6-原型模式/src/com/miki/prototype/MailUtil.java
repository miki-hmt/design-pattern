package com.miki.prototype;

import java.text.MessageFormat;

/**【1】
 * @ClassName MailUtil
 * @Description TODO  发送邮件的方法
 * @Author miki
 * @Date 2020/2/21 22:42
 * @Version 1.0
 */
public class MailUtil {

    public static void sendMail(Mail mail){
        String outputContent = "向{0}同学，邮件地址：{1},邮件内容:{2}发送邮件成功,发送时间:{3}";
        System.out.println(MessageFormat.format(outputContent,mail.getName(),mail.getEmailAddress(),mail.getContent(),mail.getSendDate()));
    }

    public static void saveOriginMailRecord(Mail mail){
        System.out.println("存储原始originMail记录，originMail:"+mail.getContent());
    }
}

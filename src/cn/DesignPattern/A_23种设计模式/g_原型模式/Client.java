package cn.DesignPattern.A_23种设计模式.g_原型模式;

import java.util.Random;

/**
 * @author Xiahu
 * @create 2019/9/18
 */
public class Client {
    private static int MAX_COUNT = 6;


    public static void main(String[] args) {
        int i = 0;
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("XX银行版权所有");

        while (i < MAX_COUNT) {
            Mail cloneMail = mail.clone();
            cloneMail.setAppellation(getRandString(5) + " 先生（女士）  ");
            cloneMail.setReceiver(getRandString(8) + "@" + getRandString(6));
            sendMail(cloneMail);
            ++i;
        }

    }

    public static void sendMail(Mail mail) {
        System.out.println("标题:" + mail.getSubject() + "\t 名称:" + mail.getAppellation() + "\t收件人:" + mail.getReceiver() + "\t...发送成功！");
    }

    //随机生成字符串
    public static String getRandString(int maxLength) {
        String source = "abcdefghijklmnopqrskuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer sb = new StringBuffer();
        Random rand = new Random();

        for(int i = 0; i < maxLength; ++i) {
            sb.append(source.charAt(rand.nextInt(source.length())));
        }

        return sb.toString();
    }
}
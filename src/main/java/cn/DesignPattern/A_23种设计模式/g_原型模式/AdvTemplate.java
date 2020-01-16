package cn.DesignPattern.A_23种设计模式.g_原型模式;

/**
 * @author Xiahu
 * @create 2019/9/18
 */

//消息模板类
public class AdvTemplate {
    private String advSubject = "XX银行国庆信用卡抽奖活动";
    private String advContext = "国庆抽奖活动通知： 只要刷卡就送你一百万！ ...";

    public AdvTemplate() {
    }

    public String getAdvSubject() {
        return this.advSubject;
    }

    public String getAdvContext() {
        return this.advContext;
    }
}
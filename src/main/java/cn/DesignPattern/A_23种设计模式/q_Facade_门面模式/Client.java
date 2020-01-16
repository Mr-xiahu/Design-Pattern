package cn.DesignPattern.A_23种设计模式.q_Facade_门面模式;


/**
 * @author XiaHu
 * @create 2020/1/15
 */
public class Client {
    public static void main(String[] args) {
        Mediator mediator = new Mediator();
        mediator.sendLetter("亲爱的,你好。。。。", "湖北省孝感市孝感大道666号");
    }
}
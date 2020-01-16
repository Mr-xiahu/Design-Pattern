package cn.DesignPattern.A_23种设计模式.q_Facade_门面模式;


/**
 * @author XiaHu
 * @create 2020/1/15
 */


/**
 * 写信接口,关于写信的方法
 */
public interface ILetterProcess {
    //写信
    void writeLetter(String content);

    //封装信封
    void fillEnvelope(String name);

    //将信件装入信封
    void letterIntoEnvelope();

    //发送信件
    void sendLetter();

}
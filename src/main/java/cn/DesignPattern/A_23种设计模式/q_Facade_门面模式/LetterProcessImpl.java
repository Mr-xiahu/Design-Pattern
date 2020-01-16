package cn.DesignPattern.A_23种设计模式.q_Facade_门面模式;


/**
 * @author XiaHu
 * @create 2020/1/15
 */

/**
 * ILetterProcess的实现类
 */
public class LetterProcessImpl implements ILetterProcess {

    public LetterProcessImpl() {
    }

    @Override()
    public void writeLetter(String context) {
        System.out.println("信的内容:" + context);
    }

    @Override()
    public void fillEnvelope(String context) {
        System.out.println("信封地址:" + context);
    }


    @Override()
    public void letterIntoEnvelope() {
        System.out.println("将信装入信封");
    }

    @Override()
    public void sendLetter() {
        System.out.println("发送信件");
    }

    @Override
    public String toString() {
        return LetterProcessImpl.class.getName();
    }
}
package cn.DesignPattern.A_23种设计模式.q_Facade_门面模式;


/**
 * @author XiaHu
 * @create 2020/1/15
 */

/**
 * 调停者:帮你写信,送信等一系列操作
 */
public class Mediator {
    private ILetterProcess letterProcess = new LetterProcessImpl();
    private Police police = new Police();

    /**
     * 现在你只需要将信的内容和收信地址告诉我,我来帮你写信,检查信封是否安全,并且帮你发送出去
     *
     * @param content 信件的内容
     * @param address 收件地址
     */
    public void sendLetter(String content, String address) {
        this.letterProcess.writeLetter(content);
        this.letterProcess.fillEnvelope(address);
        this.letterProcess.letterIntoEnvelope();
        this.police.checkLetter(letterProcess);
        this.letterProcess.sendLetter();
    }

}
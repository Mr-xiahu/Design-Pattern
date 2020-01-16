package cn.DesignPattern.A_23种设计模式.q_Facade_门面模式;


/**
 * @author XiaHu
 * @create 2020/1/15
 */

/**
 * 邮政工作人员
 */
public class Police {
    //检查信件是否安全
    public void checkLetter(ILetterProcess letterProcess) {
        System.out.println(letterProcess + "这个信件是安全的");
    }

}
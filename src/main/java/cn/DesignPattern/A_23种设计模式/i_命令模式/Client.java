package cn.DesignPattern.A_23种设计模式.i_命令模式;

/**
 * @author Xiahu
 * @create 2019/9/18
 */
public class Client {
    public static void main(String[] args) {
        Invoker xh = new Invoker();
        Command commond = new AddRequirementCommand();
        xh.setCommand(commond);
        xh.action();
    }
}
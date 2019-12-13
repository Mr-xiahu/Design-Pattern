package cn.DesignPattern.A_23种设计模式.i_命令模式;

/**
 * @author Xiahu
 * @create 2019/9/18
 */

//负责人
public class Invoker {
    private Command command;

    //客户发出命令
    public void setCommand(Command command) {
        this.command = command;
    }

    //执行客户的命令
    public void action() {
        this.command.execute();
    }
}
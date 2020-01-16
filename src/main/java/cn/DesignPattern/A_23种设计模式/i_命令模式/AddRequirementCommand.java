package cn.DesignPattern.A_23种设计模式.i_命令模式;

/**
 * @author Xiahu
 * @create 2019/9/18
 */

//增加需求命令类
public class AddRequirementCommand extends Command {
    public AddRequirementCommand() {
    }

    public void execute() {
        super.rg.find();
        super.rg.add();
        super.rg.delete();
        super.rg.plan();
    }
}
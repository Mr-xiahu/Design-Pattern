package cn.DesignPattern.A_23种设计模式.i_命令模式;

/**
 * @author Xiahu
 * @create 2019/9/18
 */
public abstract class Command {
    /**
     * 需求组,美工组,编码组
     */
    protected RequirementGroup rg = new RequirementGroup();
    protected PageGroup pg = new PageGroup();
    protected CodeGroup cg = new CodeGroup();

    public Command() {
    }

    public abstract void execute();
}
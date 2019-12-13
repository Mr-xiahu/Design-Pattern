package cn.DesignPattern.A_23种设计模式.i_命令模式;

/**
 * @author Xiahu
 * @create 2019/9/18
 */
public class RequirementGroup {
    public RequirementGroup() {
    }

    public void find() {
        System.out.println("找到需求组----");
    }

    public void add() {
        System.out.println("增加需求----");
    }

    public void delete() {
        System.out.println("删除需求----");
    }

    public void plan() {
        System.out.println("执行需求计划----");
    }
}
package cn.DesignPattern.A_23种设计模式.i_命令模式;

/**
 * @author Xiahu
 * @create 2019/9/18
 */
public class PageGroup {
    public PageGroup() {
    }

    public void find() {
        System.out.println("找到美工组----");
    }

    public void add() {
        System.out.println("增加美工----");
    }

    public void delete() {
        System.out.println("删除美工----");
    }

    public void plan() {
        System.out.println("执行美工计划----");
    }
}
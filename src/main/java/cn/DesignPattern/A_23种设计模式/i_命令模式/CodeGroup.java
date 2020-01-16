package cn.DesignPattern.A_23种设计模式.i_命令模式;

/**
 * @author Xiahu
 * @create 2019/9/18
 */
public class CodeGroup {
    public CodeGroup() {
    }

    public void find() {
        System.out.println("找到编码组----");
    }

    public void add() {
        System.out.println("增加编码----");
    }

    public void delete() {
        System.out.println("删除编码----");
    }

    public void plan() {
        System.out.println("执行编码计划----");
    }
}
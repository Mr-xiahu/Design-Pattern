package cn.DesignPattern.A_23种设计模式.j_责任链模式.old;

/**
 * @author Xiahu
 * @create 2019/9/18
 */
public class Son extends Handler {
    public Son() {
        super(3);
    }

    public void response(Woman women) {
        System.out.println("--------母亲向儿子请示-------");
        System.out.println(women.getRequest());
        System.out.println("儿子的答复是:同意\n");
    }
}
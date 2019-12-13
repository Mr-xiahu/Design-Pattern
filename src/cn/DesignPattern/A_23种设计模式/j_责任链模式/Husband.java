package cn.DesignPattern.A_23种设计模式.j_责任链模式;

/**
 * @author Xiahu
 * @create 2019/9/18
 */
public class Husband extends Handler {
    public Husband() {
        super(2);
    }

    public void response(Woman women) {
        System.out.println("--------妻子向丈夫请示-------");
        System.out.println(women.getRequest());
        System.out.println("丈夫的答复是:同意\n");
    }
}
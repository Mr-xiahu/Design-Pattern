package cn.DesignPattern.A_23种设计模式.j_责任链模式;

/**
 * @author Xiahu
 * @create 2019/9/18
 */
public class Father extends Handler {
    public Father() {
        super(1);
    }

    public void response(Woman women) {
        System.out.println("--------女儿向父亲请示-------");
        System.out.println(women.getRequest());
        System.out.println("父亲的答复是:同意\n");
    }
}
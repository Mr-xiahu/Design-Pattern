package cn.DesignPattern.A_23种设计模式.p_观察者模式;

/**
 * @author Xiahu
 * @create 2019/10/11
 * @since 1.0.0
 */

/**
 * 间谍老大实现类
 */
public class Lisi implements ILisi, ObServer {


    @Override
    public void reportQingShiHuang(String message) {
        System.out.println("秦始皇你好,韩非子有活动了..." + message);
    }

    @Override
    public void update(String context) {
        System.out.println("李斯：韩非子有情况,开始汇报");
        this.reportQingShiHuang(context);
        System.out.println("汇报完毕");
    }
}
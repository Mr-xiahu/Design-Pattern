package cn.DesignPattern.A_23种设计模式.p_观察者模式.old;

/**
 * @author Xiahu
 * @create 2019/10/11
 * @since 1.0.0
 */
public class Client {
    public static void main(String[] args) {
        //间谍李四
        ObServer lisi = new Lisi();
        //被监控者韩非子
        HanFeiZi hanFeiZi = new HanFeiZi();
        //添加李四去监控韩非子
        hanFeiZi.addObServer(lisi);
        hanFeiZi.eat();
        hanFeiZi.play();
    }
}
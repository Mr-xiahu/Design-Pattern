package cn.DesignPattern.A_23种设计模式.l_strategy.example;

/**
 * @author Xiahu
 * @create 2019/12/12
 * @since 1.0.0
 */
public class Client {
    public static void main(String[] args) {
        //今天周末,我啥事,想造作一下
        Person me = new Person();
        //去运动一下把
        me.actice(new Sport());
        //吃点东西把
        me.actice(new Food());
        //听会歌吧
        me.actice(new Music());

        //lamda
        new Thread(() ->
                System.out.println(Thread.currentThread().getName())
        ).start();

    }
}
package cn.DesignPattern.A_23种设计模式.d_模板模式;


/**
 * @author XIAHU
 * @create 2019/9/3
 */

public class Hummer2 extends HummerModel {
    public Hummer2() {
    }

    public void alarm() {
        System.out.println("悍马H2鸣笛...");
    }

    public void engineBoom() {
        System.out.println("悍马H2引擎声音是这样的...");
    }

    public void start() {
        System.out.println("悍马H2发动...");
    }

    public void stop() {
        System.out.println("悍马H2停车...");
    }

    public void run() {
        this.start();
        this.engineBoom();
        this.alarm();
        this.stop();
    }
}
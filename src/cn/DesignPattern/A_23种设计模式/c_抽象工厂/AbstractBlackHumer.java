package cn.DesignPattern.A_23种设计模式.c_抽象工厂;


/**
 * @author XIAHU
 * @create 2019/9/3
 */

public abstract class AbstractBlackHumer implements Person {
    public AbstractBlackHumer() {
    }

    public void getColor() {
        System.out.println("黑色的人种");
    }

    public void getTalk() {
        System.out.println("说鸟语");
    }

    public void getSex() {
    }
}
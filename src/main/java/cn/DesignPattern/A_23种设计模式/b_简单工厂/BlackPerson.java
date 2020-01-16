package cn.DesignPattern.A_23种设计模式.b_简单工厂;



/**
 * @author XIAHU
 * @create 2019/9/3
 */

public class BlackPerson implements Person {
    public BlackPerson() {
    }

    public void getColor() {
        System.out.println("黑色人种");
    }

    public void getTalk() {
        System.out.println("说鸟语");
    }
}
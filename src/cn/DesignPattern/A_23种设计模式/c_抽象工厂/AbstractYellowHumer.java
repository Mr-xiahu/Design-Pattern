package cn.DesignPattern.A_23种设计模式.c_抽象工厂;


/**
 * @author XIAHU
 * @create 2019/9/3
 */

public class AbstractYellowHumer implements Person {
    public AbstractYellowHumer() {
    }

    public void getColor() {
        System.out.println("黄色的人种");
    }

    public void getTalk() {
        System.out.println("说汉语");
    }

    public void getSex() {
    }
}
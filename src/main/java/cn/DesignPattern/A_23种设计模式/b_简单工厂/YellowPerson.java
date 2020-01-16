package cn.DesignPattern.A_23种设计模式.b_简单工厂;


/**
 * @author XIAHU
 * @create 2019/9/3
 */

public class YellowPerson implements Person {
    public YellowPerson() {
    }

    public void getColor() {
        System.out.println("黄色的人种");
    }

    public void getTalk() {
        System.out.println("说汉语");
    }
}
package cn.DesignPattern.A_23种设计模式.c_抽象工厂;


/**
 * @author XIAHU
 * @create 2019/9/3
 */

public abstract class AbstractWhiteHumer implements Person {
    public AbstractWhiteHumer() {
    }

    public void getColor() {
        System.out.println("白色的人种");
    }

    public void getTalk() {
        System.out.println("说英语");
    }

    public void getSex() {
    }

}
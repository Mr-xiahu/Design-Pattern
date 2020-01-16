package cn.DesignPattern.A_23种设计模式.b_简单工厂;


/**
 * @author XIAHU
 * @create 2019/9/3
 */

public class WhirtPerson implements Person {
    public WhirtPerson() {
    }

    public void getColor() {
        System.out.println("白色的人");
    }

    public void getTalk() {
        System.out.println("说英语");
    }
}
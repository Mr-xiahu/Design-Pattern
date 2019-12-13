package cn.DesignPattern.A_23种设计模式.c_抽象工厂;


/**
 * @author XIAHU
 * @create 2019/9/3
 */

public class Client {
    public static void main(String[] args) {
        //男性工厂
        HumerFactory maleHumanFactory = new MaleFactory();
        //女性工厂
        HumerFactory femaleHumanFactory = new FemaleFactory();
        Person maleYellowHuman = maleHumanFactory.createYellowHumer();
        Person femaleYellowHuman = femaleHumanFactory.createYellowHumer();
        System.out.println("---生产一个黄色女性---");
        femaleYellowHuman.getColor();
        femaleYellowHuman.getTalk();
        femaleYellowHuman.getSex();
        System.out.println("\n---生产一个黄色男性---");
        maleYellowHuman.getColor();
        maleYellowHuman.getTalk();
        maleYellowHuman.getSex();
    }
}
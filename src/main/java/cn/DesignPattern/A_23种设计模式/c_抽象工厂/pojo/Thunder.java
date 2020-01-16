package cn.DesignPattern.A_23种设计模式.c_抽象工厂.pojo;


import cn.DesignPattern.A_23种设计模式.c_抽象工厂.abstractor.Food;

/**
 * @author XIAHU
 * @create 2019/12/23
 */

public class Thunder extends Food {


    @Override
    public void eat() {
        System.out.println("雷电真好吃！！！！");
    }
}
package cn.DesignPattern.A_23种设计模式.c_抽象工厂.pojo;


import cn.DesignPattern.A_23种设计模式.c_抽象工厂.abstractor.Weapon;

/**
 * @author XIAHU
 * @create 2019/12/23
 */

public class Ak47 extends Weapon {


    @Override
    public void voice() {
        System.out.println("Ak47.....突突突突突");
    }
}
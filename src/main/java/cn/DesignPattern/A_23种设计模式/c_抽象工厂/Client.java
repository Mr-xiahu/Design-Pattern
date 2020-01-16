package cn.DesignPattern.A_23种设计模式.c_抽象工厂;


import cn.DesignPattern.A_23种设计模式.c_抽象工厂.abstractor.Food;
import cn.DesignPattern.A_23种设计模式.c_抽象工厂.abstractor.Mounts;
import cn.DesignPattern.A_23种设计模式.c_抽象工厂.abstractor.Weapon;

/**
 * @author XIAHU
 * @create 2019/12/23
 */

public class Client {
    public static void main(String[] args) {
        AbstractFactory factory = new MagicFactory();
        Food food = factory.createFood();
        food.eat();
        Mounts mounts = factory.createMounts();
        mounts.name();
        Weapon weapon = factory.createWeapon();
        weapon.voice();

    }


}
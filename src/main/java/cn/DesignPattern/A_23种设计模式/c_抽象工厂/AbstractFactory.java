package cn.DesignPattern.A_23种设计模式.c_抽象工厂;


import cn.DesignPattern.A_23种设计模式.c_抽象工厂.abstractor.Food;
import cn.DesignPattern.A_23种设计模式.c_抽象工厂.abstractor.Mounts;
import cn.DesignPattern.A_23种设计模式.c_抽象工厂.abstractor.Weapon;

/**
 * @author XIAHU
 * @create 2019/12/23
 */


//抽象工厂类
public abstract class AbstractFactory {
    public abstract Food createFood();

    public abstract Weapon createWeapon();

    public abstract Mounts createMounts();
}
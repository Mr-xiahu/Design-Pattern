package cn.DesignPattern.A_23种设计模式.c_抽象工厂;


import cn.DesignPattern.A_23种设计模式.c_抽象工厂.AbstractFactory;
import cn.DesignPattern.A_23种设计模式.c_抽象工厂.abstractor.Food;
import cn.DesignPattern.A_23种设计模式.c_抽象工厂.abstractor.Mounts;
import cn.DesignPattern.A_23种设计模式.c_抽象工厂.abstractor.Weapon;
import cn.DesignPattern.A_23种设计模式.c_抽象工厂.pojo.Ak47;
import cn.DesignPattern.A_23种设计模式.c_抽象工厂.pojo.Bread;
import cn.DesignPattern.A_23种设计模式.c_抽象工厂.pojo.Car;

/**
 * @author XIAHU
 * @create 2019/12/23
 */

public class ModernFactory extends AbstractFactory {


    @Override
    public Food createFood() {
        return new Bread();
    }

    @Override
    public Weapon createWeapon() {
        return new Ak47();
    }

    @Override
    public Mounts createMounts() {
        return new Car();
    }
}
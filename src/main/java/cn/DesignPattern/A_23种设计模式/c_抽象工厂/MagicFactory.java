package cn.DesignPattern.A_23种设计模式.c_抽象工厂;


import cn.DesignPattern.A_23种设计模式.c_抽象工厂.abstractor.Food;
import cn.DesignPattern.A_23种设计模式.c_抽象工厂.abstractor.Mounts;
import cn.DesignPattern.A_23种设计模式.c_抽象工厂.abstractor.Weapon;
import cn.DesignPattern.A_23种设计模式.c_抽象工厂.pojo.Ajatar;
import cn.DesignPattern.A_23种设计模式.c_抽象工厂.pojo.Magicbang;
import cn.DesignPattern.A_23种设计模式.c_抽象工厂.pojo.Thunder;

/**
 * @author XIAHU
 * @create 2019/12/23
 */

public class MagicFactory extends AbstractFactory {


    @Override
    public Food createFood() {
        return new Thunder();
    }

    @Override
    public Weapon createWeapon() {
        return new Magicbang();
    }

    @Override
    public Mounts createMounts() {
        return new Ajatar();
    }
}
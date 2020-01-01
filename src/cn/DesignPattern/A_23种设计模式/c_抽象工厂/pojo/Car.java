package cn.DesignPattern.A_23种设计模式.c_抽象工厂.pojo;


import cn.DesignPattern.A_23种设计模式.c_抽象工厂.abstractor.Mounts;

/**
 * @author XIAHU
 * @create 2019/12/23
 */

public class Car extends Mounts {


    @Override
    public void name() {
        System.out.println("这是一辆兰博拉个基尼");
    }
}
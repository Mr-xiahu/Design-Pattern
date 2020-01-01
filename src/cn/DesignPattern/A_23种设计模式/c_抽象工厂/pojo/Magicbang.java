package cn.DesignPattern.A_23种设计模式.c_抽象工厂.pojo;


import cn.DesignPattern.A_23种设计模式.c_抽象工厂.abstractor.Weapon;

/**
 * @author XIAHU
 * @create 2019/12/23
 */

public class Magicbang extends Weapon {


    @Override
    public void voice() {
        System.out.println("魔法棒......滋滋滋吱吱吱吱");
    }
}
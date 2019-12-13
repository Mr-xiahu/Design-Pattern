package cn.DesignPattern.A_23种设计模式.b_简单工厂;


/**
 * @author XIAHU
 * @create 2019/9/3
 */

public class NvWa {
    public NvWa() {
    }

    public static void main(String[] args) {
        PersonFactory personFactory = new PersonFactory();
        YellowPerson person = (YellowPerson) personFactory.create(YellowPerson.class);
        person.getColor();
        person.getTalk();
    }
}
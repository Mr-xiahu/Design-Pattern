package cn.DesignPattern.A_23种设计模式.c_抽象工厂;


/**
 * @author XIAHU
 * @create 2019/9/3
 */

//女性工厂
public class FemaleFactory implements HumerFactory {

    public FemaleFactory() {
    }

    public Person createYellowHumer() {
        return new FemaleYellowHuman();
    }

    public Person createWhiteHumer() {
        return new FemaleWhiteHuman();
    }

    public Person createBlackHumer() {
        return new FemaleBlackHuman();
    }
}
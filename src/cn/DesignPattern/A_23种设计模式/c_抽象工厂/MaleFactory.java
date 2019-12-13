package cn.DesignPattern.A_23种设计模式.c_抽象工厂;


/**
 * @author XIAHU
 * @create 2019/9/3
 */


//男性工厂
public class MaleFactory implements HumerFactory {
    public MaleFactory() {
    }

    public Person createYellowHumer() {
        return new MaleYellowHuman();
    }

    public Person createWhiteHumer() {
        return new MaleWhiteHuman();
    }

    public Person createBlackHumer() {
        return new MaleBlackwHuman();
    }
}
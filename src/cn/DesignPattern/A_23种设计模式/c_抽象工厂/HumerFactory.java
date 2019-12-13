package cn.DesignPattern.A_23种设计模式.c_抽象工厂;


/**
 * @author XIAHU
 * @create 2019/9/3
 */

/**
 * 人类工厂接口
 */
public interface HumerFactory {

    Person createYellowHumer();

    Person createWhiteHumer();

    Person createBlackHumer();
}
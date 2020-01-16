package cn.DesignPattern.A_23种设计模式.b_简单工厂;




/**
 * @author XIAHU
 * @create 2019/8/30
 */

public abstract class AbstractFactory {

    public AbstractFactory() {
    }

    public abstract <T extends Person> T create(Class c);
}
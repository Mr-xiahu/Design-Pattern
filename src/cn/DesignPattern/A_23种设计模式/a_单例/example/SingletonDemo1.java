package cn.DesignPattern.A_23种设计模式.a_单例.example;

/**
 * @author Xiahu
 * @create 2019/12/12
 * @since 1.0.0
 */

/**
 * 饿汉式
 */
public class SingletonDemo1 {
    private static SingletonDemo1 singleton = new SingletonDemo1();

    //私有化构造方法
    private SingletonDemo1() {
    }

    //getSingleton
    public static SingletonDemo1 getSingleton() {
        return singleton;
    }
}
package cn.DesignPattern.A_23种设计模式.a_单例.example;

/**
 * @author Xiahu
 * @create 2019/12/12
 * @since 1.0.0
 */

/**
 * 静态内部类方式,JVM保证单例
 */
public class SingletonDemo6 {
    private SingletonDemo6() {
    }

    private static class SingletonDemo6Hold {
        private static SingletonDemo6 INSTANCE = new SingletonDemo6();
    }

    public static SingletonDemo6 getInstance() {
        return SingletonDemo6Hold.INSTANCE;
    }


}
package cn.DesignPattern.A_23种设计模式.a_单例_singleton.example;

/**
 * @author Xiahu
 * @create 2019/12/12
 * @since 1.0.0
 */

/**
 * 懒汉式
 * 这种方式会发生线程安全性问题
 */
public class SingletonDemo2 {
    private static SingletonDemo2 singleton;

    //私有化构造方法
    private SingletonDemo2() {
    }

    public static SingletonDemo2 getSingleton() {
        if (singleton == null) {
            singleton = new SingletonDemo2();
        }
        return singleton;
    }

}
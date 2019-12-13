package cn.DesignPattern.A_23种设计模式.a_单例.example;

/**
 * @author Xiahu
 * @create 2019/12/12
 * @since 1.0.0
 */

/**
 * 懒汉式
 * 这种方式会发生线程安全性问题
 * 现在为了线程安全性问题,来加锁.
 * 但是,JVM中的指令重排序会影响最终的结果.
 * 所有我们得使用volatile
 */
public class SingletonDemo4 {
    private static volatile SingletonDemo4 singleton;

    //私有化构造方法
    private SingletonDemo4() {
    }

    public static SingletonDemo4 getSingleton() {
        if (singleton == null) {
            synchronized (SingletonDemo4.class) {
                if (singleton == null) {
                    singleton = new SingletonDemo4();
                }
            }
        }
        return singleton;
    }

}
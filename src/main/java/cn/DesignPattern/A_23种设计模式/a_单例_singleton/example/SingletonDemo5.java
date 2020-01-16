package cn.DesignPattern.A_23种设计模式.a_单例_singleton.example;

/**
 * @author Xiahu
 * @create 2019/12/12
 * @since 1.0.0
 */

/**
 * 枚举类单例模式
 */
public enum SingletonDemo5 {
    INSTANCE;

    public void doSomething(){
        System.out.println(".......");
    }

    public static void main(String[] args) {
        SingletonDemo5 instance = SingletonDemo5.INSTANCE;
    }


}
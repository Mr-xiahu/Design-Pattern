package cn.DesignPattern.A_23种设计模式.d_模板模式;


/**
 * @author XIAHU
 * @create 2019/9/3
 */

public abstract class HummerModel {
    //悍马车模型
    public HummerModel() {
    }

    public abstract void start();

    public abstract void stop();

    //喇叭
    public abstract void alarm();

    //引擎声
    public abstract void engineBoom();

    public abstract void run();
}


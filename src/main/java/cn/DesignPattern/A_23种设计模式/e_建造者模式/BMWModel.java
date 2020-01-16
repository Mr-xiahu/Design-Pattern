package cn.DesignPattern.A_23种设计模式.e_建造者模式;

/**
 * @author Xiahu
 * @create 2019/9/11
 */
public class BMWModel extends CarModel {
    public BMWModel() {
    }

    protected void start() {
        System.out.println("宝马车启动");
    }

    protected void stop() {
        System.out.println("奔驰车停止");
    }

    protected void alarm() {
        System.out.println("奔驰车喇叭");
    }

    protected void engineBoom() {
        System.out.println("奔驰车引擎");
    }
}
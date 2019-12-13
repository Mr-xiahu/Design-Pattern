package cn.DesignPattern.A_23种设计模式.l_策略模式.example;

/**
 * @author Xiahu
 * @create 2019/12/12
 * @since 1.0.0
 */
public class Music implements IPlan {

    @Override
    public void doSomeThing() {
        System.out.println("听音乐");
    }
}
package cn.DesignPattern.A_23种设计模式.f_代理模式.C_动态代理;

/**
 * @author Xiahu
 * @create 2019/9/11
 */

/**
 * 前置通知
 */
public class BeforAdvice implements IAdvice {
    public BeforAdvice() {
    }

    public void exec() {
        System.out.println("我是前置通知,我被执行了！ ");
    }
}
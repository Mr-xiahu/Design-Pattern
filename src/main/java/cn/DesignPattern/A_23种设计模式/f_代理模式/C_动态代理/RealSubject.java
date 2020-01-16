package cn.DesignPattern.A_23种设计模式.f_代理模式.C_动态代理;

/**
 * @author Xiahu
 * @create 2019/9/11
 */
public class RealSubject implements Subject {

    @Override
    public void doSomething() {
        System.out.println("嘿呀嘿呀嘿呀嘿呀！！！！");
    }
}
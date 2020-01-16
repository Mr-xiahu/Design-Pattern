package cn.DesignPattern.A_23种设计模式.l_strategy.example;

/**
 * @author Xiahu
 * @create 2019/12/12
 * @since 1.0.0
 */

//人类
public class Person {

    public void actice(IPlan plan) {
        plan.doSomeThing();
    }
}
package cn.DesignPattern.A_23种设计模式.f_代理模式.C_动态代理;

import java.lang.reflect.InvocationHandler;

/**
 * @author Xiahu
 * @create 2019/9/11
 */
public class Client {
    public static void main(String[] args) {
        //
        Subject subject = new RealSubject();
        InvocationHandler handler = new MyInvocationHandler(subject);
        Subject o = (Subject) DynamicProxy.newProxyInstance(subject.getClass().getClassLoader(), subject.getClass().getInterfaces(), handler);
        o.doSomething();
    }
}
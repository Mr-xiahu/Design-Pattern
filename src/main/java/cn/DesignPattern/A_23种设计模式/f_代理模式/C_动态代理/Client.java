package cn.DesignPattern.A_23种设计模式.f_代理模式.C_动态代理;

import java.lang.reflect.InvocationHandler;

/**
 * @author Xiahu
 * @create 2019/9/11
 */
public class Client {
    public static void main(String[] args) {
        //1.生成一个对象
        Subject subject = new RealSubject();
        //2.生成代理对象
        Subject obj = (Subject) DynamicProxy.newProxyInstance(
                subject.getClass().getClassLoader(),//获取代理类的类加载器
                subject.getClass().getInterfaces(),//获取代理类的接口
                new MyInvocationHandler(subject));//获取具体的执行方法
        obj.doSomething();
    }
}
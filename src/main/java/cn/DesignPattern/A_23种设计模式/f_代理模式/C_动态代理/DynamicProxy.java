package cn.DesignPattern.A_23种设计模式.f_代理模式.C_动态代理;

/**
 * @author Xiahu
 * @create 2019/9/11
 */

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * 动态代理
 */
public class DynamicProxy<T> {
    //实例化一个代理对象
    public static <T> T newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler handler) {
        //3.生成Proxy前执行一段逻辑
        new BeforAdvice().exec();
        //4.返回代理对象
        return (T) Proxy.newProxyInstance(loader, interfaces, handler);
    }
}
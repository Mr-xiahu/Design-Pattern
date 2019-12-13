package cn.DesignPattern.A_23种设计模式.f_代理模式.C_动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Xiahu
 * @create 2019/9/11
 */
public class MyInvocationHandler  implements InvocationHandler {
    private Object obj;

    public MyInvocationHandler() {
    }

    public MyInvocationHandler(Object obj) {
        this.obj = obj;
    }

    //反射生成
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("11111111111");
        return method.invoke(this.obj, args);
    }
}
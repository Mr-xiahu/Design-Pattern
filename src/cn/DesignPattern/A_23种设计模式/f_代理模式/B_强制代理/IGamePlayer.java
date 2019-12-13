package cn.DesignPattern.A_23种设计模式.f_代理模式.B_强制代理;

/**
 * @author Xiahu
 * @create 2019/9/18
 */
public interface IGamePlayer {
    void login(String var1, String var2);

    void killBoss();

    void upgrade();

    //每个人都可以找一下自己的代理
    IGamePlayer getProxy();
}
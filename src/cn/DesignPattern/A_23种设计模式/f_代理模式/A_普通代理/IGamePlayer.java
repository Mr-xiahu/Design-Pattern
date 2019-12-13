package cn.DesignPattern.A_23种设计模式.f_代理模式.A_普通代理;

/**
 * @author Xiahu
 * @create 2019/9/11
 */
public interface IGamePlayer {
    /**
     * 登陆，杀怪，升级
     */
    void login(String username, String password);

    void killBoss();

    void upgrade();
}
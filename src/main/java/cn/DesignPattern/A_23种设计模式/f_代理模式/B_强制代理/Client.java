package cn.DesignPattern.A_23种设计模式.f_代理模式.B_强制代理;

/**
 * @author Xiahu
 * @create 2019/9/18
 */
public class Client {
    public static void main(String[] args) {
        IGamePlayer player = new GamePlayer("张三");
        IGamePlayer proxy = player.getProxy();
        System.out.println("开始时间是： 2009-8-25 10:45");
        proxy.login("zhangSan", "password");
        proxy.killBoss();
        proxy.upgrade();
        System.out.println("结束时间是： 2009-8-26 03:40");
    }
}
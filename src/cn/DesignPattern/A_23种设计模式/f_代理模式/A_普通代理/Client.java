package cn.DesignPattern.A_23种设计模式.f_代理模式.A_普通代理;

/**
 * @author Xiahu
 * @create 2019/9/11
 */
public class Client {
    public static void main(String[] args) {
        //1.实例化游戏玩家张三
        IGamePlayer gamePlayer = new GamePlayer("张三");
        //2.游戏代练代理张三游戏
        IGamePlayer proxy = new GamePlayProxy(gamePlayer);
        proxy.login("张三", "111111");
        proxy.killBoss();
        proxy.upgrade();
    }
}
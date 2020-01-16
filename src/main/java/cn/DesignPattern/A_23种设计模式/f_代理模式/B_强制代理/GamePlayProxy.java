package cn.DesignPattern.A_23种设计模式.f_代理模式.B_强制代理;

/**
 * @author Xiahu
 * @create 2019/9/18
 */

//游戏代理实现
public class GamePlayProxy implements IGamePlayer {
    private IGamePlayer gamePlayer = null;

    public GamePlayProxy() {
    }

    public GamePlayProxy(IGamePlayer gamePlayer) {
        this.gamePlayer = gamePlayer;
    }

    @Override
    public void login(String user, String password) {
        this.gamePlayer.login(user, password);
    }

    @Override
    public void killBoss() {
        this.gamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.gamePlayer.upgrade();
    }

    public IGamePlayer getProxy() {
        return this;
    }
}
package cn.DesignPattern.A_23种设计模式.f_代理模式.A_普通代理;

/**
 * @author Xiahu
 * @create 2019/9/11
 */

/**
 * 普通游戏玩家
 */
public class GamePlayer implements IGamePlayer {

    private String name;

    public GamePlayer() {
    }

    public GamePlayer(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void login(String user, String password) {
        System.out.println("登录名为" + user + "的用户登录成功！");
    }

    @Override
    public void killBoss() {
        System.out.println(this.name + "在打怪！ ");
    }

    @Override
    public void upgrade() {
        System.out.println(this.name + " 又升了一级！ ");
    }
}
package cn.DesignPattern.A_23种设计模式.f_代理模式.B_强制代理;

/**
 * @author Xiahu
 * @create 2019/9/18
 */

//游戏玩家
public class GamePlayer implements IGamePlayer {
    private String name;
    private IGamePlayer proxy = null;

    public GamePlayer() {}

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
        if (this.isProxy()) {
            System.out.println("登录名为" + user + "的用户" + this.name + "登录成功！");
        } else {
            System.out.println("请使用指定的代理访问");
        }

    }

    @Override
    public void killBoss() {
        if (this.isProxy()) {
            System.out.println(this.name + "在打怪！ ");
        } else {
            System.out.println("请使用指定的代理访问");
        }

    }

    //校验是否代理登陆
    private boolean isProxy() {
        if (this.proxy == null) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public void upgrade() {
        if (this.isProxy()) {
            System.out.println(this.name + " 又升了一级！ ");
        } else {
            System.out.println("请使用指定的代理访问");
        }

    }

    @Override
    public IGamePlayer getProxy() {
        this.proxy = new GamePlayProxy(this);
        return this.proxy;
    }
}
package cn.DesignPattern.A_23种设计模式.m_适配器模式;

/**
 * @author Xiahu
 * @create 2019/9/19
 */
public class Client {
    public static void main(String[] args) {
        IUserInfo youngGril = new UserInfo();

        int i;
        for (i = 0; i < 100; ++i) {
            youngGril.getMobilePaone();
        }

        youngGril = new OutUserInfo();

        for (i = 0; i < 100; ++i) {
            youngGril.getMobilePaone();
        }

    }
}
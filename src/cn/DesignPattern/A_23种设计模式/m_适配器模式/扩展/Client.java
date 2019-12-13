package cn.DesignPattern.A_23种设计模式.m_适配器模式.扩展;

import cn.DesignPattern.A_23种设计模式.m_适配器模式.IUserInfo;
import cn.DesignPattern.A_23种设计模式.m_适配器模式.扩展.impl.UserBaseInfo;
import cn.DesignPattern.A_23种设计模式.m_适配器模式.扩展.impl.UserHomeInfo;
import cn.DesignPattern.A_23种设计模式.m_适配器模式.扩展.impl.UserOfficInfo;

/**
 * @author Xiahu
 * @create 2019/9/19
 */
public class Client {
    public static void main(String[] args) {
        IOutUserBaseInfo baseInfo = new UserBaseInfo();
        IOutUserHomeInfo homeInfo = new UserHomeInfo();
        IOutUserOfficInfo officeInfo = new UserOfficInfo();
        IUserInfo youngGirl = new OutUserInfos(baseInfo, officeInfo, homeInfo);

        for (int i = 0; i < 101; ++i) {
            youngGirl.getMobilePaone();
        }

    }
}
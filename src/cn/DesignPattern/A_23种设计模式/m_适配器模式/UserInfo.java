package cn.DesignPattern.A_23种设计模式.m_适配器模式;

/**
 * @author Xiahu
 * @create 2019/9/19
 */
public class UserInfo implements IUserInfo {
    public UserInfo() {
    }

    @Override
    public String getUserName() {
        System.out.println("我的名字叫张三");
        return null;
    }

    @Override
    public String getAddress() {
        System.out.println("家住上海市xxxx");
        return null;
    }

    @Override
    public String getMobilePaone() {
        System.out.println("移动电话是132xxxx..xxx");
        return null;
    }

    @Override
    public String getOfficTelNumber() {
        System.out.println("办公室电话是:3123123");
        return null;
    }

    @Override
    public String getJobDescription() {
        System.out.println("这个工作主要是XXXXXXXXXXXXX");
        return null;
    }
}
package cn.DesignPattern.A_23种设计模式.m_适配器模式;

import java.util.Map;

/**
 * @author Xiahu
 * @create 2019/9/19
 */
public class OutUserInfo extends OutInfo implements IUserInfo {
    private Map baseInfo = super.getUserBaseInfo();
    private Map officInfo = super.getUserOfficInfo();
    private Map homework = super.getUserHomeInfo();

    public OutUserInfo() {
    }

    @Override
    public String getUserName() {
        String username = (String) this.baseInfo.get("name");
        System.out.println(username);
        return username;
    }

    @Override
    public String getAddress() {
        String address = (String) this.homework.get("address");
        System.out.println(address);
        return address;
    }

    @Override
    public String getMobilePaone() {
        String MobilePhone = (String) this.baseInfo.get("MobilePhone");
        System.out.println(MobilePhone);
        return MobilePhone;
    }

    @Override
    public String getOfficTelNumber() {
        String officTelNum = (String) this.officInfo.get("officTelNum");
        System.out.println(officTelNum);
        return officTelNum;
    }

    @Override
    public String getJobDescription() {
        String jobDescription = (String) this.officInfo.get("jobDescription");
        System.out.println(jobDescription);
        return jobDescription;
    }
}
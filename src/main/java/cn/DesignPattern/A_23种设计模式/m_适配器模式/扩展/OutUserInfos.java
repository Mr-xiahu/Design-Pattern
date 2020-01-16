package cn.DesignPattern.A_23种设计模式.m_适配器模式.扩展;

import cn.DesignPattern.A_23种设计模式.m_适配器模式.IUserInfo;

import java.util.Map;

/**
 * @author Xiahu
 * @create 2019/9/19
 */
public class OutUserInfos implements IUserInfo {
    private IOutUserBaseInfo baseInfo = null;
    private IOutUserOfficInfo officInfo = null;
    private IOutUserHomeInfo homeInfo = null;
    private Map baseMap;
    private Map officMap;
    private Map homeMap;

    public OutUserInfos(IOutUserBaseInfo baseInfo, IOutUserOfficInfo officInfo, IOutUserHomeInfo homeInfo) {
        this.baseInfo = baseInfo;
        this.officInfo = officInfo;
        this.homeInfo = homeInfo;
        this.baseMap = this.baseInfo.getBaseInfo();
        this.officMap = this.officInfo.getOfficInfo();
        this.homeMap = this.homeInfo.getHomeInfo();
    }

    @Override
    public String getUserName() {
        String name = (String)this.baseMap.get("name");
        System.out.println(name);
        return name;
    }

    @Override
    public String getAddress() {
        String address = (String)this.homeMap.get("address");
        System.out.println(address);
        return null;
    }

    @Override
    public String getMobilePaone() {
        String MobilePhone = (String)this.baseMap.get("MobilePhone");
        System.out.println(MobilePhone);
        return null;
    }

    @Override
    public String getOfficTelNumber() {
        String officTelNumber = (String)this.officMap.get("officTelNumber");
        System.out.println(officTelNumber);
        return null;
    }

    @Override
    public String getJobDescription() {
        String jobDescription = (String)this.officMap.get("jobDescription");
        System.out.println(jobDescription);
        return null;
    }
}
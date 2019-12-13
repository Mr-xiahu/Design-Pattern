package cn.DesignPattern.A_23种设计模式.m_适配器模式.扩展.impl;

import cn.DesignPattern.A_23种设计模式.m_适配器模式.扩展.IOutUserOfficInfo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Xiahu
 * @create 2019/9/19
 */
public class UserOfficInfo implements IOutUserOfficInfo {
    public UserOfficInfo() {
    }

    public Map getOfficInfo() {
        HashMap<String, String> officInfo = new HashMap();
        officInfo.put("jobDescription", "这个工作是xxxxxxxxxxxxx");
        officInfo.put("officTelNumber", "165xxxxxxxx");
        return officInfo;
    }
}
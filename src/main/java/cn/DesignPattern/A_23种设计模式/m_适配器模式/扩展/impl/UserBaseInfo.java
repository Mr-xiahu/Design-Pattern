package cn.DesignPattern.A_23种设计模式.m_适配器模式.扩展.impl;

import cn.DesignPattern.A_23种设计模式.m_适配器模式.扩展.IOutUserBaseInfo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Xiahu
 * @create 2019/9/19
 */
public class UserBaseInfo implements IOutUserBaseInfo {
    public UserBaseInfo() {
    }

    @Override
    public Map getBaseInfo() {
        HashMap<String, String> baseInfo = new HashMap();
        baseInfo.put("name", "李四");
        baseInfo.put("MobilePhone", "199xxxxxx");
        return baseInfo;
    }
}
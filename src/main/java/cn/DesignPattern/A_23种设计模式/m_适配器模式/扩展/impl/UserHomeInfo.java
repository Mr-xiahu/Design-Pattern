package cn.DesignPattern.A_23种设计模式.m_适配器模式.扩展.impl;

import cn.DesignPattern.A_23种设计模式.m_适配器模式.扩展.IOutUserHomeInfo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Xiahu
 * @create 2019/9/19
 */
public class UserHomeInfo implements IOutUserHomeInfo {
    public UserHomeInfo() {
    }

    @Override
    public Map getHomeInfo() {
        HashMap<String, String> homeInfo = new HashMap();
        homeInfo.put("address", "武汉市xxxxxxxxxx");
        return homeInfo;
    }
}
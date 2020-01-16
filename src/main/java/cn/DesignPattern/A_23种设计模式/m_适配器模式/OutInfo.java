package cn.DesignPattern.A_23种设计模式.m_适配器模式;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Xiahu
 * @create 2019/9/19
 */
public class OutInfo implements IOutUser {
    public OutInfo() {
    }

    @Override
    public Map getUserBaseInfo() {
        HashMap<String, String> baseInfo = new HashMap();
        baseInfo.put("name", "混世魔王");
        baseInfo.put("MobilePhone", "1321xxxxxx");
        return baseInfo;
    }

    @Override
    public Map getUserOfficInfo() {
        HashMap<String, String> officInfo = new HashMap();
        officInfo.put("officTelNum", "24654xxx");
        officInfo.put("jobDescription", "这个工作是干xxxxxxxxxx");
        return officInfo;
    }

    @Override
    public Map getUserHomeInfo() {
        HashMap<String, String> homeInfo = new HashMap();
        homeInfo.put("address", "北京市xxxxxx");
        return homeInfo;
    }
}
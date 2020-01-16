package cn.DesignPattern.A_23种设计模式.m_适配器模式;

/**
 * @author Xiahu
 * @create 2019/9/19
 */

import java.util.Map;

/**
 * 外包公司员工接口
 */
public interface IOutUser {
    /**
     * 基础信息,工作信息,家庭信息
     */
    Map getUserBaseInfo();

    Map getUserOfficInfo();

    Map getUserHomeInfo();
}
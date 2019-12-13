package cn.DesignPattern.A_23种设计模式.m_适配器模式;

/**
 * @author Xiahu
 * @create 2019/9/19
 */

/**
 * 本公司员工接口
 */
public interface IUserInfo {
    /**
     * 职员名称，家庭住址，手机号,座机号,工作描述
     * @return
     */
    String getUserName();

    String getAddress();

    String getMobilePaone();

    String getOfficTelNumber();

    String getJobDescription();
}
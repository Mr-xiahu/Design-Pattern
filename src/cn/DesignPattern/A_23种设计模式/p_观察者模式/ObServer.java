package cn.DesignPattern.A_23种设计模式.p_观察者模式;

/**
 * @author Xiahu
 * @create 2019/10/11
 * @since 1.0.0
 */

/**
 * 监视者-----间谍
 */
public interface ObServer {
    /**
     * 向老大汇报
     * @param context
     */
    void update(String context);
}
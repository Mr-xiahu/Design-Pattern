package cn.DesignPattern.A_23种设计模式.p_观察者模式;

/**
 * @author Xiahu
 * @create 2019/10/11
 * @since 1.0.0
 */

/**
 * 被观察者接口
 */
public interface ObServable {
    /**
     * 被观察者可能会：添加一个人来监视他,减少一个人来监视他
     *
     * @param var1
     */
    void addObServer(ObServer var1);

    void deleteObServer(ObServer var1);

    //既然要观察， 我发生改变了他也应该有所动作， 通知观察者
    void notifyObServers(String var1);

}
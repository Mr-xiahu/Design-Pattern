package cn.DesignPattern.A_23种设计模式.j_责任链模式.old;

/**
 * @author Xiahu
 * @create 2019/9/18
 */

//女人接口
public interface IWoman {

    /**
     * 当前状态,准备干啥
     */
    int getType();

    String getRequest();
}
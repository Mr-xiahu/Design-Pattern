package cn.DesignPattern.A_23种设计模式.h_中介者模式;

/**
 * @author Xiahu
 * @create 2019/9/18
 */

//抽象同事类
public abstract class AbstractColleague {
    protected AbstractMediator mediator;

    //
    public AbstractColleague(AbstractMediator mediator) {
        this.mediator = mediator;
    }
}
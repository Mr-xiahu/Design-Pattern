package cn.DesignPattern.A_23种设计模式.h_中介者模式;

/**
 * @author Xiahu
 * @create 2019/9/18
 */
public abstract class AbstractMediator {
    /**
     * 采购者,销售者,库存
     */
    protected Purchase purchase = new Purchase(this);
    protected Sale sale = new Sale(this);
    protected Stock stock = new Stock(this);

    public AbstractMediator() {
    }

    //中介者最重要的方法叫做事件方法， 处理多个对象之间的关系
    public abstract void execute(String var1, Object... var2);
}
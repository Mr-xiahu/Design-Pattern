package cn.DesignPattern.A_23种设计模式.h_中介者模式;

/**
 * @author Xiahu
 * @create 2019/9/18
 */

//库存类
public class Stock extends AbstractColleague {
    private static int COMPUTER_NUMBER = 100;

    public Stock(AbstractMediator _mediator) {
        super(_mediator);
    }


    //库存增加
    public void increase(int number) {
        COMPUTER_NUMBER += number;
        System.out.println("库存数量为： " + COMPUTER_NUMBER);
    }


    //库存减少
    public void decrease(int number) {
        COMPUTER_NUMBER -= number;
        System.out.println("库存数量为： " + COMPUTER_NUMBER);
    }

    //查看库存量
    public int getStockNumber() {
        return COMPUTER_NUMBER;
    }


    //通知不要采购,尽快销售
    public void clearStock() {
        System.out.println("清理存货数量为： " + COMPUTER_NUMBER);
        super.mediator.execute("stock.clear", new Object[0]);
    }
}
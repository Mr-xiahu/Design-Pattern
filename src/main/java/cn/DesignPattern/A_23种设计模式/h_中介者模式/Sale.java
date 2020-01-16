package cn.DesignPattern.A_23种设计模式.h_中介者模式;

import java.util.Random;

/**
 * @author Xiahu
 * @create 2019/9/18
 */
public class Sale extends AbstractColleague {
    public Sale(AbstractMediator _mediator) {
        super(_mediator);
    }

    public void sellIBMComputer(int number) {
        super.mediator.execute("sale.sell", new Object[]{number});
        System.out.println("销售IBM电脑" + number + "台");
    }

    public int getSaleStatus() {
        Random rand = new Random(System.currentTimeMillis());
        int saleStatus = rand.nextInt(100);
        System.out.println("IBM电脑的销售情况为： " + saleStatus);
        return saleStatus;
    }


    //打折处理
    public void offSale() {
        super.mediator.execute("sale.offsell", new Object[0]);
    }
}
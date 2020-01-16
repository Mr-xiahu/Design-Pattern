package cn.DesignPattern.A_23种设计模式.h_中介者模式;

/**
 * @author Xiahu
 * @create 2019/9/18
 */
public class Client {
    public static void main(String[] args) {
        //中介者
        AbstractMediator mediator = new Mediator();
        System.out.println("------采购人员采购电脑--------");
        Purchase purchase = new Purchase(mediator);
        purchase.buyIBMcomputer(100);
        System.out.println("\n------销售人员销售电脑--------");
        Sale sale = new Sale(mediator);
        sale.sellIBMComputer(1);
        System.out.println("\n------库房管理人员清库处理--------");
        Stock stock = new Stock(mediator);
        stock.clearStock();
    }
}
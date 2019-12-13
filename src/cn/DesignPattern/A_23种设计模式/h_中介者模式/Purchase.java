package cn.DesignPattern.A_23种设计模式.h_中介者模式;

/**
 * @author Xiahu
 * @create 2019/9/18
 */
public class Purchase extends AbstractColleague {
    public Purchase(AbstractMediator _mediator) {
        super(_mediator);
    }

    /**
     * 购买电脑,停止购买
     *
     */


    public void buyIBMcomputer(int number) {
        super.mediator.execute("purchase.buy", new Object[]{number});
    }

    public void refuseBuyIBM() {
        System.out.println("不再采购IBM电脑");
    }
}
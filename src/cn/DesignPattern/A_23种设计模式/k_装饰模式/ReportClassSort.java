package cn.DesignPattern.A_23种设计模式.k_装饰模式;

/**
 * @author Xiahu
 * @create 2019/9/19
 */

/**
 * 装饰类:报告班级排名
 */
public class ReportClassSort extends Decorator {

    public ReportClassSort(SchoolReport sr) {
        super(sr);

    }

    public void reportClassSort() {
        System.out.println("这次我在班级排名30");
    }

    @Override
    public void report() {
        super.report();
        this.reportClassSort();
    }
}
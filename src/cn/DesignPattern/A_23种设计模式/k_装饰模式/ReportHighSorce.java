package cn.DesignPattern.A_23种设计模式.k_装饰模式;

/**
 * @author Xiahu
 * @create 2019/9/19
 */

/**
 * 装饰类:报告最高分数
 */
public class ReportHighSorce extends Decorator {

    /**
     * 通过构造方法去调用装饰方法
     */
    public ReportHighSorce(SchoolReport sr) {
        super(sr);

    }


    public void reportHighSorce() {
        System.out.println("这次考试成绩,语文最高：75，数学最高：70.自然最高：73");
    }

    @Override
    public void report() {
        super.report();
        this.reportHighSorce();
    }
}
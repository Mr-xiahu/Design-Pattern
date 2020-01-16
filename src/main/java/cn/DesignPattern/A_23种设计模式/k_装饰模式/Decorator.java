package cn.DesignPattern.A_23种设计模式.k_装饰模式;

/**
 * @author Xiahu
 * @create 2019/9/19
 */

/**
 * 装饰者核心类
 */
public class Decorator extends SchoolReport {
    private SchoolReport sr;

    public Decorator(SchoolReport sr) {
        this.sr = sr;
    }

    @Override
    public void report() {
        this.sr.report();
    }

    @Override
    public void sign(String name) {
        this.sr.sign(name);
    }
}
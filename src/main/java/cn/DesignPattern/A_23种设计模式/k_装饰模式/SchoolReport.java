package cn.DesignPattern.A_23种设计模式.k_装饰模式;

/**
 * @author Xiahu
 * @create 2019/9/19
 */

/**
 * 学校成绩单类,具有两个方法
 */
public abstract class SchoolReport {
    public SchoolReport() {
    }

    /**
     * 展示成绩,家长签字
     */
    public abstract void report();

    public abstract void sign(String name);
}
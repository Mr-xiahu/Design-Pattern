package cn.DesignPattern.A_23种设计模式.k_装饰模式;

/**
 * @author Xiahu
 * @create 2019/9/19
 */

/**
 * 六年级学校成绩单
 */
public class SixSchoolReport extends SchoolReport {
    public SixSchoolReport() {
    }

    @Override
    public void report() {
        System.out.println("尊敬的xxx家长");
        System.out.println("...");
        System.out.println("语文: 67  数学:  68    自然: 70");
        System.out.println("...");
        System.out.println("家长签字:_______");
    }

    @Override
    public void sign(String name) {
        System.out.println("家长姓名为:" + name);
    }
}
package cn.DesignPattern.A_23种设计模式.k_装饰模式;

/**
 * @author Xiahu
 * @create 2019/9/19
 */
public class Client {
    public static void main(String[] args) {
        SchoolReport report = new SixSchoolReport();
        report = new ReportHighSorce(report);
        report = new ReportClassSort(report);
        report.report();
        report.sign("混蛋");
    }

}
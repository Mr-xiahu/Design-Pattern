package cn.DesignPattern.A_23种设计模式.o_组合模式;

/**
 * @author Xiahu
 * @create 2019/10/11
 * @since 1.0.0
 */

/**
 * 所有人员信息类
 */
public abstract class Corp {
    /**
     * 姓名,职位,薪水
     */
    private String name;
    private String position;
    private int salary;

    public Corp(String _name, String _position, int _salary) {
        this.name = _name;
        this.position = _position;
        this.salary = _salary;
    }

    public String getInfo() {
        String info = "";
        info = "姓名： " + this.name;
        info = info + "\t职位： " + this.position;
        info = info + "\t薪水： " + this.salary;
        return info;
    }
}
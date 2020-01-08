package cn.DesignPattern.A_23种设计模式.j_责任链模式.news;

/**
 * @author Xiahu
 * @create 2019/12/30
 * @since 1.0.0
 */
public class Msg {
    private String name;
    private String msg;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    @Override
    public String toString() {
        return "Msg{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
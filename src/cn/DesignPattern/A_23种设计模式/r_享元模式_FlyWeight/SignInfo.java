package cn.DesignPattern.A_23种设计模式.r_享元模式_FlyWeight;

/**
 * @author Xiahu
 * @create 2020/1/10
 * @since 1.0.0
 */

/**
 * 单个信息
 */
public class SignInfo {
    private Integer id;
    private String location;
    private String subject;

    public SignInfo() {
    }

    public SignInfo(Integer id, String location, String subject) {
        this.id = id;
        this.location = location;
        this.subject = subject;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
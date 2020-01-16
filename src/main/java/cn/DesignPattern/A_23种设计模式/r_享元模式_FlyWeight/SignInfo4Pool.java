package cn.DesignPattern.A_23种设计模式.r_享元模式_FlyWeight;

/**
 * @author Xiahu
 * @create 2020/1/10
 * @since 1.0.0
 */
public class SignInfo4Pool extends SignInfo {
    private String key;

    public SignInfo4Pool(String key) {
        this.key = key;
    }

    public String getKey() {
        return this.key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
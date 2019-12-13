package cn.DesignPattern.A_23种设计模式.j_责任链模式;

/**
 * @author Xiahu
 * @create 2019/9/18
 */
public class Woman implements IWoman {
    /**
     * 请求,身份
     */
    private String request;
    private int level;

    public Woman(int level, String request) {
        this.level = level;
        switch (this.level) {
            case 1:
                this.request = "女儿的请求是:" + request;
                break;
            case 2:
                this.request = "妻子的请求是:" + request;
                break;
            case 3:
                this.request = "母亲的请求是:" + request;
        }

    }

    @Override
    public int getType() {
        return this.level;
    }

    @Override
    public String getRequest() {
        return this.request;
    }
}
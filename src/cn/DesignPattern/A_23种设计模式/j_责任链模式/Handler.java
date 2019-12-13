package cn.DesignPattern.A_23种设计模式.j_责任链模式;

/**
 * @author Xiahu
 * @create 2019/9/18
 */
public abstract class Handler {
    public static final int FATHER_LEVEL_REQUEST = 1;
    public static final int HUSBAND_LEVEL_REQUEST = 2;
    public static final int SON_LEVEL_REQUEST = 3;
    private int level = 0;
    private Handler nextHandler;

    public Handler(int level) {
        this.level = level;
    }

    //一个女性（女儿、 妻子或者是母亲） 要求逛街， 你要处理这个请求
    public final void handlerMessage(Woman women) {
        if (women.getType() == this.level) {
            this.response(women);
        } else if (this.nextHandler != null) {//有后续环节， 才把请求往后递送
            this.nextHandler.handlerMessage(women);
        } else {//已经没有后续处理人了， 不用处理了
            System.out.println("不同意");
        }

    }

    /**
     * 如果不属于你处理的请求， 你应该让她找下一个环节的人， 如女儿出嫁了，
     * 还向父亲请示是否可以逛街， 那父亲就应该告诉女儿， 应该找丈夫请示
     */
    public void setNext(Handler handler) {
        this.nextHandler = handler;
    }

    //处理请求
    public abstract void response(Woman woman);
}
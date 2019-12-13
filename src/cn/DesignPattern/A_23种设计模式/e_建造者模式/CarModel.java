package cn.DesignPattern.A_23种设计模式.e_建造者模式;

import java.util.ArrayList;

/**
 * @author
 * @create 2019/9/11
 */
public abstract class CarModel {
    private ArrayList<String> sequence = new ArrayList();

    public CarModel() {
    }

    protected abstract void start();

    protected abstract void stop();

    protected abstract void alarm();

    protected abstract void engineBoom();

    public final void run() {
        for(int i = 0; i < this.sequence.size(); i++) {
            String actionName = (String)this.sequence.get(i);
            if (actionName.equalsIgnoreCase("start")) {
                this.start();
            } else if (actionName.equalsIgnoreCase("stop")) {
                this.stop();
            } else if (actionName.equalsIgnoreCase("alarm")) {
                this.alarm();
            } else if (actionName.equalsIgnoreCase("engine boom")) {
                this.engineBoom();
            }
        }

    }

    public final void setSequence(ArrayList sequence) {
        this.sequence = sequence;
    }
}
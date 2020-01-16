package cn.DesignPattern.A_23种设计模式.e_建造者模式;

import java.util.ArrayList;

/**
 * @author Xiahu
 * @create 2019/9/11
 */
public class Client {
    public static void main(String[] args) {
        BenzModel benz = new BenzModel();
        ArrayList<String> sequence = new ArrayList();
        sequence.add("engine boom");
        sequence.add("stop");
        benz.setSequence(sequence);
        benz.run();
    }
}
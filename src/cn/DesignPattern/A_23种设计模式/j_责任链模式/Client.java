package cn.DesignPattern.A_23种设计模式.j_责任链模式;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 * @author Xiahu
 * @create 2019/9/18
 */
public class Client {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<IWoman> arrayList = new ArrayList();

        for (int i = 0; i < 5; ++i) {
            arrayList.add(new Woman(random.nextInt(4), "我要去逛街"));
        }

        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();
        father.setNext(husband);
        husband.setNext(son);
        Iterator iterator = arrayList.iterator();

        while (iterator.hasNext()) {
            IWoman women = (IWoman) iterator.next();
            father.handlerMessage((Woman) women);
        }

    }
}
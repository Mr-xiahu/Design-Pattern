package cn.DesignPattern.A_23种设计模式.p_观察者模式;

/**
 * @author Xiahu
 * @create 2019/10/11
 * @since 1.0.0
 */

import java.util.ArrayList;
import java.util.Iterator;

/**
 * 被观察者实现类
 */
public class HanFeiZi implements ObServable, IHanFeiZi {
    private ArrayList<ObServer> list = new ArrayList();

    @Override
    public void eat() {
        System.out.println("韩非子正在吃饭");
        this.notifyObServers("韩非子吃饭了");
    }

    @Override
    public void play() {
        System.out.println("韩非子正在玩蛇");
        this.notifyObServers("韩非子正在玩蛇");
    }

    @Override
    public void addObServer(ObServer obServer) {
        this.list.add(obServer);
    }

    @Override
    public void deleteObServer(ObServer obServer) {
        this.list.remove(obServer);
    }

    @Override
    public void notifyObServers(String context) {
        Iterator<ObServer> iterator = this.list.iterator();
        while (iterator.hasNext()) {
            ObServer obServer = iterator.next();
            obServer.update(context);
        }
    }
}
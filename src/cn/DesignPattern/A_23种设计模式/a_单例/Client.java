package cn.DesignPattern.A_23种设计模式.a_单例;


/**
 * @author XIAHU
 * @create 2019/8/30
 */

public class Client {
    public static void main(String[] args) {
        for (int i = 0; i < 5; ++i) {
            Person person = Person.getPerson();
            System.out.print("第" + (i + 1) + "位参见的是");
            person.say();
            System.out.println();
        }

    }

}
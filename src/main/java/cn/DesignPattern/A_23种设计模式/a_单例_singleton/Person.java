package cn.DesignPattern.A_23种设计模式.a_单例_singleton;


import java.util.ArrayList;
import java.util.Random;

/**
 * @author XIAHU
 * @create 2019/8/30
 */

public class Person {
    private static int maxNumOfPerson = 2;
    private static ArrayList<String> nameList = new ArrayList();
    private static ArrayList<Person> personList = new ArrayList();
    private static int countNumOfPerson = 0;

    private Person(String name) {
        nameList.add(name);
    }

    public static Person getPerson() {
        Random random = new Random();
        countNumOfPerson = random.nextInt(maxNumOfPerson);
        return (Person) personList.get(countNumOfPerson);
    }

    public void say() {
        System.out.println((String) nameList.get(countNumOfPerson));
    }

    static {
        for (int i = 0; i < maxNumOfPerson; ++i) {
            personList.add(new Person("皇帝" + i));
        }

    }
}

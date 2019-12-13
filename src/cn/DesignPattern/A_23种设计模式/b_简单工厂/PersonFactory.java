package cn.DesignPattern.A_23种设计模式.b_简单工厂;


/**
 * @author XIAHU
 * @create 2019/9/3
 */

public class PersonFactory extends AbstractFactory {
    public PersonFactory() {
    }


    @Override
    public <T extends Person> T create(Class c) {
        Person person = null;

        try {
            person = (Person) Class.forName(c.getName()).newInstance();
        } catch (Exception var4) {
            System.out.println("造人失败");
        }

        return (T) person;
    }
}
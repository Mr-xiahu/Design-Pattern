package cn.DesignPattern.A_23种设计模式.n_迭代器模式;

/**
 * @author Xiahu
 * @create 2019/9/19
 */
public interface IProject {
    void add(String name, int num, int cost);

    String getProjectInfo();

    IProjectIterator iterator();
}
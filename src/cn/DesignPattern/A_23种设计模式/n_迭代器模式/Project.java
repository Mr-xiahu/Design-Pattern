package cn.DesignPattern.A_23种设计模式.n_迭代器模式;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Xiahu
 * @create 2019/9/19
 */
public class Project implements IProject {
    private List<IProject> projectList = new ArrayList();
    private String name = "";
    private int num;
    private int cost = 0;

    public Project() {
    }

    public Project(String name, int num, int cost) {
        this.name = name;
        this.num = num;
        this.cost = cost;
    }

    @Override
    public void add(String name, int num, int cost) {
        this.projectList.add(new Project(name, num, cost));
    }

    @Override
    public String getProjectInfo() {
        String info = "";
        info = info + "项目名称是： " + this.name;
        info = info + "\t项目人数: " + this.num;
        info = info + "\t 项目费用： " + this.cost;
        return info;
    }

    @Override
    public IProjectIterator iterator() {
        return new ProjectIterator(this.projectList);
    }
}
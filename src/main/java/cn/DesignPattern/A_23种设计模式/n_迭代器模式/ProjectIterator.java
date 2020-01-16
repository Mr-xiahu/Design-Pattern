package cn.DesignPattern.A_23种设计模式.n_迭代器模式;

import java.util.List;

/**
 * @author Xiahu
 * @create 2019/9/19
 */
public class ProjectIterator implements IProjectIterator {
    private List<IProject> projectList;
    private int currentItem = 0;

    public ProjectIterator(List<IProject> projectList) {
        this.projectList = projectList;
    }

    @Override
    public boolean hasNext() {
        boolean flag = true;
        if (this.currentItem >= this.projectList.size()) {
            flag = false;
        }

        return flag;
    }

    @Override
    public IProject next() {
        return (IProject) this.projectList.get(this.currentItem++);
    }

    @Override
    public void remove() {
    }
}
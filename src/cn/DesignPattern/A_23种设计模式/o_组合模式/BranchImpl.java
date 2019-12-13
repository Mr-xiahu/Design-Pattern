package cn.DesignPattern.A_23种设计模式.o_组合模式;

/**
 * @author Xiahu
 * @create 2019/10/11
 * @since 1.0.0
 */

import java.util.ArrayList;

/**
 * 树枝节点,(root是树枝,root分散的树枝也是属于树枝)
 */
public class BranchImpl extends  Corp {

    private String name;
    private String position;
    private int salary;
    ArrayList<Corp> subordinateList = new ArrayList();

    public BranchImpl(String _name, String _position, int _salary) {
        super(_name, _position, _salary);
    }

    /**
     * 添加子节点
     * @param core
     */
    public void addSubordinate(Corp core) {
        this.subordinateList.add(core);
    }

    /**
     * 遍历子节点
     * @return
     */
    public ArrayList<Corp> getSubordinate() {
        return this.subordinateList;
    }
}
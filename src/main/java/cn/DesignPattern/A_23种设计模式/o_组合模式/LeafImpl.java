package cn.DesignPattern.A_23种设计模式.o_组合模式;

/**
 * @author Xiahu
 * @create 2019/10/11
 * @since 1.0.0
 */

/**
 * 树叶节点(最小的单位)
 */
public class LeafImpl extends Corp {

    public LeafImpl(String _name, String _position, int _salary) {
        super(_name, _position, _salary);
    }
}
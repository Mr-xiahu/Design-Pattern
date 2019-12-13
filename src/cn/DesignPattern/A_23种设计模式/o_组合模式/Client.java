package cn.DesignPattern.A_23种设计模式.o_组合模式;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author Xiahu
 * @create 2019/10/11
 * @since 1.0.0
 */
public class Client {
    public static void main(String[] args) {
        BranchImpl ceo = compositeCorpTree();
        System.out.println(ceo.getInfo());
        System.out.println(getTreeInfo(ceo));
    }


    //组装树结构
    public static BranchImpl compositeCorpTree() {
        BranchImpl root = new BranchImpl("王大麻子", "总经理", 100000);
        BranchImpl developDep = new BranchImpl("刘大瘸子", "研发部门经理", 10000);
        BranchImpl salesDep = new BranchImpl("马二拐子", "销售部门经理", 20000);
        BranchImpl financeDep = new BranchImpl("赵三驼子", "财务部经理", 30000);
        BranchImpl firstDevGroup = new BranchImpl("杨三乜斜", "开发一组组长", 5000);
        BranchImpl secondDevGroup = new BranchImpl("吴大棒槌", "开发二组组长", 6000);
        LeafImpl a = new LeafImpl("a", "开发人员", 2000);
        LeafImpl b = new LeafImpl("b", "开发人员", 2000);
        LeafImpl c = new LeafImpl("c", "开发人员", 2000);
        LeafImpl d = new LeafImpl("d", "开发人员", 2000);
        LeafImpl e = new LeafImpl("e", "开发人员", 2000);
        LeafImpl f = new LeafImpl("f", "开发人员", 2000);
        LeafImpl g = new LeafImpl("g", "开发人员", 2000);
        LeafImpl h = new LeafImpl("h", "销售人员", 5000);
        LeafImpl i = new LeafImpl("i", "销售人员", 4000);
        LeafImpl j = new LeafImpl("j", "财务人员", 5000);
        LeafImpl k = new LeafImpl("k", "CEO秘书", 8000);
        LeafImpl zhengLaoLiu = new LeafImpl("郑老六", "研发部副经理", 20000);
        root.addSubordinate(k);
        root.addSubordinate(developDep);
        root.addSubordinate(salesDep);
        root.addSubordinate(financeDep);
        developDep.addSubordinate(zhengLaoLiu);
        developDep.addSubordinate(firstDevGroup);
        developDep.addSubordinate(secondDevGroup);
        firstDevGroup.addSubordinate(a);
        firstDevGroup.addSubordinate(b);
        firstDevGroup.addSubordinate(c);
        secondDevGroup.addSubordinate(d);
        secondDevGroup.addSubordinate(e);
        secondDevGroup.addSubordinate(f);
        salesDep.addSubordinate(h);
        salesDep.addSubordinate(i);
        financeDep.addSubordinate(j);
        return root;
    }

    public static String getTreeInfo(BranchImpl root) {
        ArrayList<Corp> subordinateList = root.getSubordinate();
        String info = "";
        Iterator var3 = subordinateList.iterator();

        while(var3.hasNext()) {
            Corp s = (Corp)var3.next();
            if (s instanceof LeafImpl) {
                info = info + s.getInfo() + "\n";
            } else {
                info = info + s.getInfo() + "\n" + getTreeInfo((BranchImpl)s);
            }
        }

        return info;
    }
}
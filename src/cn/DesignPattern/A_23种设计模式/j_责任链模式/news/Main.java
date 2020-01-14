package cn.DesignPattern.A_23种设计模式.j_责任链模式.news;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Xiahu
 * @create 2019/12/30
 * @since 1.0.0
 */
public class Main {
    public static void main(String[] args) {
        Msg msg = new Msg();
        msg.setMsg("大家好:),<script>: 欢迎来到Design Pattern 大家都是996");

        //1.使用一个集合
        List<Filter> filters = new ArrayList<>();
        filters.add(new HtmlFilter());
        filters.add(new KeywordFilter());
        for (Filter filter : filters) {
            //filter.doFilter(msg);
        }
        System.out.println(msg);
        System.out.println("===========================================");
        //2.使用Filter Chain
        FilterChain filterChain = new FilterChain();
        filterChain.add(new HtmlFilter());
        FilterChain fc2 = new FilterChain();
        fc2.add(new KeywordFilter()).add(new FaceFilter());
        filterChain.add(fc2);
        filterChain.doFilter(msg);
        System.out.println(msg);
    }

}



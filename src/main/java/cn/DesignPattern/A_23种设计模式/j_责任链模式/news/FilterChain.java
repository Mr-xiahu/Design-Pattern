package cn.DesignPattern.A_23种设计模式.j_责任链模式.news;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Xiahu
 * @create 2019/12/30
 * @since 1.0.0
 */
public class FilterChain implements Filter {
    private List<Filter> filters = new ArrayList<>();

    public FilterChain add(Filter filter) {
        filters.add(filter);
        return this;
    }

    public boolean doFilter(Msg msg) {
        for (Filter filter : filters) {
            if (!filter.doFilter(msg)) {
                return false;
            }

        }
        return true;

    }
}
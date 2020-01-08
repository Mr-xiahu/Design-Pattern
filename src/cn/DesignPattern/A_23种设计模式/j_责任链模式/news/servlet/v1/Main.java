package cn.DesignPattern.A_23种设计模式.j_责任链模式.news.servlet.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Xiahu
 * @create 2020/1/7
 * @since 1.0.0
 */
public class Main {
    public static void main(String[] args) {
        Requert requert = new Requert();
        requert.setContext("大家好:),<script>: 欢迎来到Design Pattern 大家都是996");
        Response response = new Response();
        response.setContext("Response");
        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new HtmlFilter()).addFilter(new KeyWordFilter());
        filterChain.doFilter(requert, response, filterChain);
        System.out.println(requert.getContext());
        System.out.println(response.getContext());
    }
}

interface Filter {
    Boolean doFilter(Requert requert, Response responser, FilterChain filterChain);
}

class Requert {
    private String context;

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}

class Response {
    private String context;

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }
}

class FilterChain implements Filter {
    private List<Filter> filterChains = new ArrayList<>();
    private int index = 0;

    public FilterChain addFilter(Filter filter) {
        filterChains.add(filter);
        return this;
    }


    @Override
    public Boolean doFilter(Requert requert, Response responser, FilterChain filterChain) {
        if (index >= filterChains.size()) {
            return false;
        }

        return filterChains.get(index++).doFilter(requert, responser, filterChain);
    }
}

class HtmlFilter implements Filter {

    @Override
    public Boolean doFilter(Requert requert, Response responser, FilterChain filterChain) {
        String msg = requert.getContext();
        msg = msg.replace('<', '[').replace('>', ']');
        requert.setContext(msg + "HtmlFilter-----");
        filterChain.doFilter(requert, responser, filterChain);
        responser.setContext(responser.getContext() + "----this is HtmlFilter----");
        return true;
    }
}

class KeyWordFilter implements Filter {

    @Override
    public Boolean doFilter(Requert requert, Response responser, FilterChain filterChain) {
        String msg = requert.getContext();
        msg = msg.replace("996", "995");
        requert.setContext(msg + "KeyWordFilter-----");
        filterChain.doFilter(requert, responser, filterChain);
        responser.setContext(responser.getContext() + "----this is KeyWordFilter----");
        return true;
    }
}
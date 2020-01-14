package cn.DesignPattern.A_23种设计模式.j_责任链模式.news;

/**
 * @author Xiahu
 * @create 2019/12/30
 * @since 1.0.0
 */
public interface Filter {
    boolean doFilter(Msg msg);
}


class HtmlFilter implements Filter {

    @Override
    public boolean doFilter(Msg msg) {
        String r = msg.getMsg();
        r = r.replace("<", "[");
        r = r.replace(">", "]");
        msg.setMsg(r);
        return true;
    }
}

class KeywordFilter implements Filter {

    @Override
    public boolean doFilter(Msg msg) {
        String r = msg.getMsg();
        return false;
        //r = r.replace("996", "995");
        //msg.setMsg(r);

    }
}

class FaceFilter implements Filter {

    @Override
    public boolean doFilter(Msg msg) {
        String r = msg.getMsg();
        r = r.replace(":)", "^_^");
        return true;
    }
}
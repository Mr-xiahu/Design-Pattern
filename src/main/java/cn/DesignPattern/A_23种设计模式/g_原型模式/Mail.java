package cn.DesignPattern.A_23种设计模式.g_原型模式;

/**
 * @author Xiahu
 * @create 2019/9/18
 */

//以克隆方法为核心
public class Mail implements Cloneable {
    /**
     * 收件人,邮件名称,称谓,邮件内容,邮件尾部信息
     */
    private String receiver;
    private String subject;
    private String appellation;
    private String contxt;
    private String tail;

    public Mail(AdvTemplate advTemplate) {
        this.contxt = advTemplate.getAdvContext();
        this.subject = advTemplate.getAdvSubject();
    }

    @Override
    public Mail clone() {
        Mail mail = null;
        try {
            mail = (Mail)super.clone();
        } catch (CloneNotSupportedException var3) {
            var3.printStackTrace();
        }

        return mail;
    }

    public String getReceiver() {
        return this.receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return this.subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAppellation() {
        return this.appellation;
    }

    public void setAppellation(String appellation) {
        this.appellation = appellation;
    }

    public String getContxt() {
        return this.contxt;
    }

    public void setContxt(String contxt) {
        this.contxt = contxt;
    }

    public String getTail() {
        return this.tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }
}
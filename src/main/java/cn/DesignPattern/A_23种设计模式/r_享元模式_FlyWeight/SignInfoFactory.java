package cn.DesignPattern.A_23种设计模式.r_享元模式_FlyWeight;

import java.util.HashMap;

/**
 * @author Xiahu
 * @create 2020/1/10
 * @since 1.0.0
 */
public class SignInfoFactory {
    private static HashMap<String, SignInfo> pool = new HashMap();

    public SignInfoFactory() {
    }

    public static SignInfo getSignInfo(String key) {
        SignInfo result = null;
        if (!pool.containsKey(key)) {
            System.out.println(key + "----建立对象， 并放置到池中");
            result = new SignInfo4Pool(key);
            pool.put(key, result);
        } else {
            result = (SignInfo)pool.get(key);
            System.out.println(key + "---直接从池中取得");
        }

        return (SignInfo)result;
    }
}
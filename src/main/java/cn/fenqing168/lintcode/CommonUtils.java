package cn.fenqing168.lintcode;


import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * @author fenqing
 */
public class CommonUtils {

    public static <T, V> T string2Linked(Class<T> ts, BiConsumer<T, V> setValue, Function<String, V> valueFormat, BiConsumer<T, T> setNext, String str){
        str = str.replaceAll("[\\[\\]]", "");
        String[] strs = str.split(",");
        T root = null, lastNode = null;
        for (String s : strs) {
            try {
                T t = ts.newInstance();
                setValue.accept(t, valueFormat.apply(s));
                if(root == null){
                    root = t;
                }else{
                    setNext.accept(lastNode, t);
                }
                lastNode = t;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return root;
    }

}

package WeakHasMap;

import java.util.WeakHashMap;

public class WeakHashMapClass {
    public static void main(String[] args) {
        WeakHashMap<Integer,String> wm= new WeakHashMap<>();
        Integer key=new Integer(11);
        wm.put(key,"Sample ");
        key=null;
        System.gc();
        System.out.println(wm);

    }
}

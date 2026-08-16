package LinkedHasMap;

import java.util.LinkedHashMap;

public class LinkedMap {
    public static void main(String[] args) {
        LinkedHashMap<String,String > map=new LinkedHashMap<>();
        map.put("AA","Sample 1");
        map.put("BB","Sample 2");
        map.put("cc","sample 3");

        System.out.println(map);
    }
}

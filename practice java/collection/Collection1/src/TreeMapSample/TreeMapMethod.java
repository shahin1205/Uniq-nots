package TreeMapSample;

import java.util.NavigableMap;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapMethod {
    public static void main(String[] args) {
        TreeMap<Integer,String> map=new TreeMap<>();
        map.put(1,"Sample 1");
        map.put(3,"Sample 3");
        map.put(5,"Sample 5");
        map.put(2,"Sample 2");
        map.put(4,"Sample 4");

//        System.out.println(map);

//        System.out.println(map.firstKey());
//        System.out.println(map.firstEntry());

//        System.out.println(map.lastKey());
//        System.out.println(map.lastEntry());


//        SortedMap<Integer,String > sr=map.headMap(4);
//        System.out.println(sr);

//        SortedMap<Integer,String> sr=map.tailMap(3);
//        System.out.println(sr);

//        SortedMap<Integer,String> sr=map.subMap(2,4);
//        System.out.println(sr);

//        NavigableMap<Integer,String> na=map.descendingMap();
//        System.out.println(na);

//        NavigableSet<Integer > na=map.descendingKeySet();
//        System.out.println(na);

        NavigableSet<Integer> na=map.navigableKeySet();
        System.out.println(na);
    }
}

package LinkedHasMap;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class EntrysetSample {
    public static void main(String[] args) {
        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
        map.put('a', 3);
        map.put('b', 2);
        map.put('c', 1);
        map.put('d', 4);
        map.put('e', 5);

        Map.Entry<Character,Integer>[] arr= map.entrySet().toArray(new Map.Entry[0]);

        List<Map.Entry<Character,Integer>> list=new ArrayList<>(map.entrySet());


        for (Map.Entry<Character, Integer> entry : list ){
            System.out.println(entry.getKey()+" "+entry.getValue());
        }
    }
}

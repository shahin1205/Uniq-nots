package Mapping;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HasMapPractice {
    public static void main(String[] args) {
        HashMap<Integer, String> hash = new HashMap<>();
        hash.put(1, "value 1");
        hash.put(2, "value 2");
        hash.put(3, "value 3");
        hash.put(4, "value 4");
        hash.put(5, "value 5");
        hash.put(6, "value 6");
        hash.put(7, "value 7");
        hash.put(8, "value 8");
        Set<Integer> keys = hash.keySet();
        int sum = 0;
        for (Integer key : keys) {
//            System.out.println(key.hashCode());
            sum = sum + key;
//            System.out.println("Sum value - "+sum);
        }
        System.out.println("Sum value - "+sum);
        Collection<String> value=hash.values();
        int count=0;
        for (String s:value){
            count++;
            if(count< value.size()) {
                System.out.print(s+",");
            }else {
                System.out.println(value);
            }

        }
    }
}

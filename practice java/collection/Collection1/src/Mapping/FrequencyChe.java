package Mapping;

import java.util.HashMap;
import java.util.Map;

public class FrequencyChe {
    public static void main(String[] args) {
        String name="java program";
        HashMap<Character,Integer> map=new HashMap<>();

        for (int i=0; i<name.length();i++){

            char ch=name.charAt(i);
            if(ch==' '){
//                map.remove(ch);
                continue;
            }
            map.put(ch,map.getOrDefault(ch,0)+1);
//            System.out.println(map);
        }
        for(Map.Entry<Character, Integer> entry:map.entrySet()){
            if(entry.getValue()==1){
                System.out.println("single character "+entry.getKey()+" = "+ entry.getValue());
            }
        }
//        System.out.println(map);
    }
}

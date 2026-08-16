package Mapping;

import java.util.ArrayList;
import java.util.HashMap;

public class Frequency {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(2);
        arr.add(1);
        arr.add(3);
        arr.add(1);
        arr.add(2);

        HashMap<Integer,Integer> map=new HashMap<>();
//        String value =map.getOrDefault(1,"defult ");
//        System.out.println(value);
//        map.put(arr.getFirst(),"value");
//        System.out.println(map);

        int num=0;
        for(Integer s:arr){
            map.put(s,map.getOrDefault(s,num)+1);
//            System.out.println(map);
        }
        System.out.println(map);
    }
}

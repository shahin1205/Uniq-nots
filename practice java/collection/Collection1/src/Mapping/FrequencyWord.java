package Mapping;

import java.util.ArrayList;
import java.util.HashMap;

public class FrequencyWord {
    public static void main(String[] args) {

        String str="java program is the best program";
        String []split=str.split(" ");

        HashMap<String,Integer> map=new HashMap<>();
        for (String s:split){
            map.put(s, map.getOrDefault(s,0)+1);
        }
        System.out.println(map);

    }
}

package Mapping;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapSample {
    public static void main(String[] args) {
        Map<Integer,String> map=new HashMap<>();
        map.put(1,"sample 1");
        map.put(2,"sample 2");
        map.put(3,"sample 3");
        map.put(4,"sample 4");
        System.out.println("Print map - "+map+"\n");

        String res=map.get(3);
        System.out.println("Get the value - "+res+"\n");

        boolean contenikey=map.containsKey(3);
        System.out.println("check the contains key - "+contenikey+"\n");

        boolean contenivalue=map.containsValue("Sample 2");
        System.out.println("check the contains value - "+contenivalue+"\n");

        int size=map.size();
        System.out.println("check the size - "+size+"\n");

        boolean empty=map.isEmpty();
        System.out.println("check it's empty - "+empty+"\n");

        Set<Integer> keyset=map.keySet();
        System.out.println("check the keyset - "+keyset+"\n");
        System.out.println("check another way for check the key set ");
        for (Integer key: map.keySet()){
            System.out.print(key);
        }
        System.out.println();

        Collection<String> value=map.values();
        System.out.println("check the value - "+value+"\n");

        String absent =map.putIfAbsent(6,"Mahin");
        System.out.println("check the putIfAbsent Method "+absent+"\n");

        String replace =map.replace(1,"Shahin");
        System.out.println("replace the value - "+replace+"\n");

        String defaults=map.getOrDefault(7,"default");
        System.out.println("check the getOrDefault method "+defaults+"\n");


        for(Map.Entry<Integer,String> entry:map.entrySet()){

            System.out.println(entry.getKey()+" "+ entry.getValue());
        }
        //        map.remove(1);


        //        map.clear();

//        HashMap <String , String> has=new HashMap<>();
//        has.put("Fb","sample 1");
//        has.put("Ea","sample 2");
//        System.out.println(has);

    }
}

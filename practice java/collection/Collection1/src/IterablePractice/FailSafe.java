package IterablePractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public class FailSafe {
    public static void main(String[] args) {

        HashMap <Integer, String> map=new HashMap<>();

        map.put(12,"sample 1");
        map.put(13,"sample 2");
        map.put(14,"sample 3");
        map.put(15,"sample 4");
        map.put(16,"sample 5");


        ConcurrentHashMap<Integer,String> order=new ConcurrentHashMap<>();
        order.putAll(map);

        System.out.println("before iterator "+order+"\n");
        Set<Integer> keyset=order.keySet();
        Iterator<Integer> at=keyset.iterator();
        while (at.hasNext()) {

            Integer num = at.next();
            if (num == 13) {
                order.remove(num);

            }
        }
        System.out.println("after iterator - "+order);


















//        ArrayList<Integer> arr=new ArrayList<>();
//        arr.add(12);
//        arr.add(13);
//        arr.add(14);
//        arr.add(15);
//        arr.add(16);
//        arr.add(17);
//        System.out.println("before change original array - " +arr+"\n");
//
//        CopyOnWriteArrayList<Integer> copy=new CopyOnWriteArrayList<>();
//        copy.addAll(arr);
//
//        Iterator<Integer> at=copy.iterator();
//
//        while (at.hasNext()){
//            Integer num = at.next();
//            if (num==12){
//                copy.remove(num);
//            }
//        }
//        System.out.println("CopyOnWriteArrayList list - "+copy + "\n");
//        arr.clear();
//        arr.addAll(copy);
//        System.out.println("after change original array list - "+arr +"\n");
//


    }
}

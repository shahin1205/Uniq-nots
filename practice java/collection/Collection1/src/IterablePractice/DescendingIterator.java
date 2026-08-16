package IterablePractice;

import java.sql.SQLOutput;
import java.util.*;

public class DescendingIterator {
    public static void main(String[] args) {
        TreeSet<Integer> has=new TreeSet<>();
        has.add(7);
        has.add(6);
        has.add(5);
        has.add(4);
        has.add(3);
        has.add(2);

//        Iterator<Integer> it=has.descendingIterator();
//
//        while(it.hasNext()){
//
//            System.out.println(it.next());
//        }

        System.out.println("Tree map Iterator");

        TreeMap<Integer,Integer> tree=new TreeMap<>();
        tree.put(7,1);
        tree.put(6,2);
        tree.put(5,3);
        tree.put(4,4);
        tree.put(3,5);
        tree.put(2,6);

        Iterator<Integer> treekey=tree.descendingKeySet().iterator();
        while (treekey.hasNext()){
            System.out.println(treekey.next());

        }

//        System.out.println("Value");
//        Iterator<Integer> treevalue=tree.navigableKeySet().iterator();
//        while (treevalue.hasNext()){
//            System.out.println(treevalue.next());
//
//        }
    }
}

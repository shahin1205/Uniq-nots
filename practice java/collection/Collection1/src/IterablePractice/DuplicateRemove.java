package IterablePractice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class DuplicateRemove {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(3);

        HashSet<Integer> has=new HashSet<>();
        Iterator<Integer> at= list.iterator();
        while (at.hasNext()){
            Integer num=at.next();
            if(has.contains(num)){
                at.remove();
            }else {
                has.add(num);
            }
        }
        System.out.println(has);
    }
}

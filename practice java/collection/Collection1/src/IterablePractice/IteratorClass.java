package IterablePractice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class IteratorClass {
    public static void main(String[] args) {
//        ArrayList<Integer> arr=new ArrayList<>();
        LinkedList<Integer> list=new LinkedList<>();
        list.add(12);
        list.add(14);
        list.add(16);
        list.add(18);
        list.add(13);

        Iterator<Integer> at=list.iterator();
//        System.out.println(at.hasNext());
        while (at.hasNext()){

//            System.out.println(at.next());
            Integer num=at.next();
            if(num==18){
                at.remove();
            }
            System.out.println(num);

        }
        System.out.println(list);

    }
}

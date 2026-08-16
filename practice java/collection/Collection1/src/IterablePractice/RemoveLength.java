package IterablePractice;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveLength {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        Iterator<Integer> at=arr.iterator();

        int count=0;
        while (at.hasNext()){
            Integer num=at.next();
            count++;
            if (count>4){
                at.remove();
            }
        }
        System.out.println(arr);
    }
}

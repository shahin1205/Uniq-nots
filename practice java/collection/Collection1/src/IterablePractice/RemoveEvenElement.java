package IterablePractice;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveEvenElement {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(6);
        arr.add(7);
        arr.add(8);

        Iterator<Integer> at=arr.iterator();

        while (at.hasNext()){
            Integer num=at.next();
            if (num%2==1){
                at.remove();
            }
        }
        System.out.println(arr);


    }
}

package Package1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class ArrayListSample {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        arr.add(12);
        arr.add(13);
        arr.add(14);
        arr.add(15);
        arr.add(16);
        arr.add(56);

//        arr.clear();
        System.out.println("This is for fist arrayList \n"+arr);

        ArrayList<Integer> arr2=new ArrayList<>();
//        arr2.addAll(arr); //This line works like  ArrayList<Integer> arr2=new ArrayList<>(arr);
//        System.out.println(arr2);
        arr2.addAll(arr);
        arr2.add(34);
        arr2.add(34);
        arr2.add(34);
        arr2.add(37);
        arr2.add(38);
//        arr.add(null);
//        arr2.remove(2);
//        arr2.removeAll(arr);
//        arr2.set(3,76);

        System.out.println("This is for second Arraylist \n"+arr2);


//        LinkedList<Integer> list=new LinkedList<>(arr);
//
//        list.add(34);
//        System.out.println("This is for LinkedList \n"+list);


    }
}

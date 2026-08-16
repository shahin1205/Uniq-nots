package LinkedListPackage;

import java.util.ArrayList;
import java.util.LinkedList;

public class Linkedlist {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList();
        arr.add(10);
        arr.add(11);
        arr.add(12);
        arr.add(14);

//        LinkedList<Integer> list=new LinkedList(arr);

        LinkedList<Integer> list=new LinkedList();
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);

        System.out.println("Print the list - " + list);

        list.addFirst(17);
        list.addLast(18);

        System.out.println("Add fist and last elament - " + list);
       int fist= list.getFirst();
        int last=list.getLast();
        System.out.println("Get the fist elament - "+fist + "\n Get last elament - "+last);


        list.removeFirst();
        list.removeLast();
        System.out.println(list);


    }
}

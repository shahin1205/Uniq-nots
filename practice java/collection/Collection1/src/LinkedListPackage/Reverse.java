package LinkedListPackage;

import java.util.LinkedList;

public class Reverse {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<Integer>();
        list.add(23);
        list.add(24);
        list.add(25);
        list.add(26);
        list.add(27);

        for (int i=list.size()-1;i>=0;i--){

            System.out.println(list.get(i));
        }


    }
}

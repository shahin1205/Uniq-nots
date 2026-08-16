package LinkedListPackage;

import java.util.LinkedList;

public class RemoveZero {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(0);
        list.add(8);
        list.add(4);
        list.add(0);
        //        System.out.println("Remove 0 ");
//        for (int i = 0; i < list.size(); i++) {
//
//            if(list.get(i)==0){
//                list.remove(i);
//                i--;
//            }
//
//        }
//        System.out.println(list);

        System.out.println("Replace to 0 to 1 ");

//        int num=list.indexOf(0);
////        System.out.println("Indexof " + num);
//        while (num>0){
//            list.set(num,1);
//            num=list.indexOf(0);
//
//        }


        for (int i = 0; i < list.size(); i++) {
            int num=list.indexOf(0);
            if(num>0){
                list.set(num,1);

            }

        }
        System.out.println(list);

    }
}

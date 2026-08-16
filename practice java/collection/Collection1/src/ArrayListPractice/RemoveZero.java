package ArrayListPractice;

import java.util.ArrayList;

public class RemoveZero {
    public static void main(String[] args) {
        ArrayList<Integer> arr =new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(0);
        arr.add(8);
        arr.add(4);
        arr.add(0);
//        System.out.println("Remove 0 ");
//        for (int i = 0; i < arr.size(); i++) {
//
//            if(arr.get(i)==0){
//                arr.remove(i);
//                i--;
//            }
//
//        }
//        System.out.println(arr);

        System.out.println("Replace to 0 to 1 ");

        int num=arr.indexOf(0);
        System.out.println("Indexof " + num);
        for (int i = 0; i < arr.size(); i++) {

            if(arr.get(i)==0){
                arr.set(i,1);

            }

        }
        System.out.println(arr);

        }
}

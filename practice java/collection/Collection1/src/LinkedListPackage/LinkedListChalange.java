package LinkedListPackage;

import java.util.LinkedList;

public class LinkedListChalange {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<Integer>();
        list.add(63);
        list.add(26);
        list.add(28);
        list.add(12);
        list.add(45);
        list.add(78);

        System.out.println("Find the minimum value ");
        Integer min=list.get(0);
        Integer secMin=list.get(0);

        for(int i=0 ; i<list.size();i++){
            int num =list.get(i);

            if (num<min){
                secMin=min;
                min=num;
            } else if (num<secMin ) {
                secMin=num;
            }
        }
        System.out.println("Fist minimum value - "+ min+"\nSecond minimum - "+secMin);

        System.out.println("\nFind the max value ");

        Integer max=list.get(0);
        Integer secmax=list.get(0);

        for(int i=0 ; i<list.size();i++){
            int num =list.get(i);

            if (num>max){
                secmax=max;
                max=num;
            } else if (num>secmax) {
                secmax=num;
            }
        }
        System.out.println("Fist maximum value - "+ max+"\nSecond maximum value - "+secmax);
    }
}

package LinkedListPackage;

import java.util.LinkedList;

public class RemoveDuplicate {
    public static void main(String[] args) {
        LinkedList <Integer> list =new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(0);
        list.add(0);
        list.add(4);
        list.add(6);

        for(int i =0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i).equals(list.get(j))){
                    list.remove(j);
                }
            }
//            System.out.println(list);
        }
        System.out.println(list);


    }
}

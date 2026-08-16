package LinkedListPackage;

import java.util.Collections;
import java.util.LinkedList;

public class Short {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<Integer>();
        list.add(23);
        list.add(22);
        list.add(26);
        list.add(25);
        list.add(29);

        for(int i = 0; i < list.size(); i++) {
            for(int j = i + 1; j < list.size(); j++) {

                if(list.get(i) > list.get(j)) {

                    int temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);

                }
            }
        }

        System.out.println(list);
    }
}

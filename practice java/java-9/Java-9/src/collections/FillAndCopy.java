package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FillAndCopy {
    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>(List.of(1, 2, 4, 6, 7, 8));
//    Collections.fill(list,2);
//        System.out.println(list);

        ArrayList<Integer> list1=new ArrayList<>(List.of(0,0,0,0,0,0));
        Collections.copy(list1,list);
        System.out.println(list1);
    }
}

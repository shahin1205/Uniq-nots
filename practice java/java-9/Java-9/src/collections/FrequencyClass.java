package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FrequencyClass {

    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(List.of(1,2,3,4));

//        int count= Collections.frequency(list,1);
//        System.out.println(count);

        ArrayList<Integer> arr=new ArrayList<>(List.of(5,6,8,7,1));
        System.out.println(Collections.disjoint(list,arr));
    }
}

package strimeApi;

import java.util.ArrayList;
import java.util.List;

public class TwoDimentionArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> res1=new ArrayList<>(List.of(1,2,3,4,5));
        ArrayList<Integer> res2=new ArrayList<>(List.of(6,7,8,9,0));

        ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
        arr.add(res1);
        arr.add(res2);

        arr.stream()

                .flatMap( x->x.stream())
                .limit(5)
                .skip(2)
                .forEach(System.out::println);

//        System.out.println(arr);

    }
}

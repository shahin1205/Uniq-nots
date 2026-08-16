package strimeApi;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Practic3 {
    public static void main(String[] args) {

        ////Primitive to non primitive
        int[] arr={1,3,5,6,7,};
        Arrays.stream(arr)
                ////if primitive array transfer to object using (mapToObj)
                .mapToObj(x->Integer.valueOf(x))
                .forEach(System.out::println);

        ////-----------------------------------------------
        ArrayList<String> names=new ArrayList<>(List.of("Shahin","Mahin","Mohammed"));
        names.stream()
                .filter((x)->x.length()==6)
                .forEach(System.out::println);
        names.stream()
                .map((s)->s.length())
                .forEach(System.out::println);
    }
}
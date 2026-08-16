package strimeApi;

import java.util.ArrayList;
import java.util.List;

public class SortedAndDistinct {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>(List.of(1,2,5,7,9,2,1));
        System.out.println("Sort the value");
        arr.stream()
                .sorted()
                .forEach(x-> System.out.print(x+" "));


        System.out.println();
        System.out.println("Using distinct remove the duplicate");
        arr.stream()
                .distinct()
                .forEach(y-> System.out.print(y+" "));


    }
}

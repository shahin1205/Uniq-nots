package strimeApi;

import java.util.ArrayList;
import java.util.List;

public class Practice {
    public static void main(String[] args) {

        ArrayList<Integer> arr=new ArrayList<>(List.of(2,3,6,8,9,1));
        //collection object to convert the stream to return stream object
//        for(int i = 0; i<arr.size(); i++)
//        {
//            Integer a = arr.get(i);
//            System.out.println(a*2);
//        }
// Stream interface one by one data travel
//Stream didN’t store the data
//stream only process the data
        arr.stream()
                .map((x)->x*2)
                .forEach(System.out::println);
//                .forEach((x)-> System.out.println(x*2));
        System.out.println("dffghj");
        arr.stream()
                .filter((x)->x%2==0)
                .forEach(System.out::println);
//                 .forEach((x)-> System.out.println(x));
    }
}

package StreamCollector;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Stream;

public class CollectorInterface {
    public static void main(String[] args) {

        Collector<Integer, ArrayList<Integer>,ArrayList<Integer>> collect=Collector.of(
                ()->new ArrayList<Integer>(),
                (arr,element)->arr.add(element),
                (arr1,arr2)->{arr1.addAll(arr2) ;return arr1;},
                (arr)->arr);


       ArrayList<Integer> s= Stream.of(2,3,4,5,6,7,8)
                .collect(collect);
        System.out.println(s);

    }
}

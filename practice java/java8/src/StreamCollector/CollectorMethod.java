package StreamCollector;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CollectorMethod {
    public static void main(String[] args) {
        ////--------------------toList()------------------------------
//        List<Integer> list= Stream.of(1,2,3,4,5)
//                .collect(Collectors.toList());   ////Integer to List
//        System.out.println(list);

        ////-----------------------------toSet()---------------
//        Set<Integer> list= Stream.of(1,2,3,4,3,5)
//                .collect(Collectors.toSet());    ////Integer to set it remove duplicate
//        System.out.println(list);

        /////------------------------toCollectioin()--------------
//
//        List<Integer> list=Stream.of(2,3,4,5,6,7)
//                .collect(Collectors.toCollection(()->new LinkedList<Integer>()));
//        System.out.println(list);

        /////------------------------joining()--------------

//        String s=Stream.of("one","two","three","four")
//                .collect(Collectors.joining());
//        System.out.println(s);

        /////------------------------counting()--------------
//        Long s=Stream.of("one","two","three","four")
//                .collect(Collectors.counting());
//        System.out.println(s);

        /////------------------------summingInt()--------------

//        Integer list=Stream.of(2,3,4,5,6,7)
//                .collect(Collectors.summingInt((x)->x));
//        System.out.println(list);
         /////------------------------averagingDouble()--------------
//        Double s=Stream.of(2,3,4,5,6,7)
//                .collect(Collectors.averagingDouble((a)->a));
//        System.out.println(s);
        /////------------------------averagingDouble()--------------

//        IntSummaryStatistics sc=Stream.of(2,3,4,5,6,7)
//                .collect(Collectors.summarizingInt((a)->a));
//        System.out.println(sc);
//        System.out.println(sc.getCount());
//        System.out.println(sc.getAverage());
//        System.out.println(sc.getMax());
//        System.out.println(sc.getMin());
//        System.out.println(sc.getSum());

       //// -------------------------------------------------------------------------------

//        Optional<Integer> i=Stream.of(2,3,4,5,6)
//                .collect(Collectors.minBy((a,b)->a-b));
//        System.out.println(i.get());
        /////----------------------------------------------------------------

//        Optional<Integer> i=Stream.of(2,3,4,5,6)
//                .collect(Collectors.reducing((a,b)->a+b));
//        System.out.println(i.get());

        /////----------------------------------------------------------------

//        Optional<Integer> i=Stream.of(2,3,4,5,6)
//                .collect(Collectors.reducing((a,b)->a+b));
//        System.out.println(i.get());

        /////----------------------------------------------------------------

//        int i=Stream.of(2,3,4,5,6)
//                .collect(Collectors.reducing(0,(a,b)->a+b));
//        System.out.println(i);

        /////----------------------------------------------------------------

//        int i=Stream.of("AA","BBB","CCCC","DDDDD")
//                .collect(Collectors.reducing(0,x->x.length(),(a,b)->a+b));
//        System.out.println(i);

//        /////----------------------------------------------------------------
//
//        List<Integer> s=Stream.of("AA","BBB","CCCC","DDDDD")
//                .collect(Collectors.mapping(x->x.length(),Collectors.toList()));
//        System.out.println(s);

        /////----------------------------------------------------------------

//        int s=Stream.of("AA","BBB","CCCC","DDDDD")
//                .collect(Collectors.collectingAndThen(Collectors.toSet(),(x)->x.size()));
//        System.out.println(s);


    }
}

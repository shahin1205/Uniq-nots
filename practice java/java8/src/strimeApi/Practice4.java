package strimeApi;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class Practice4 {
    public static void main(String[] args) {
        ////----------------min()-------------------------------------------
//        Optional<Integer> optional=Stream.of(2,1,3,4,5,6,7)
//                .min((x,y)->x-y);
//       Integer min=optional.get();
//        System.out.println(min);
////------------------------toArray()-------------------------------------------
//                Object[]arr=Stream.of(2,1,3,4,5,6,7)
//                        .filter(x->x%2!=0)
//                        .toArray();
//        System.out.println(Arrays.toString(arr) );
////---------------------------toArray--------------------------

//        Integer[]arr=Stream.of(2,1,3,4,5,6,7,5,6,7,8)
//                .filter(x->x%2!=0)
//                .toArray((x)->new Integer[x]);
//        int temp=0;
//        for(Integer i:arr){
//            temp=i;
//        }
//        System.out.println(Arrays.toString(arr) );

        ////------------------------reduce()-------------------------

//        Optional<Integer> optionalsum=Stream.of(7,6,3,6,8,9,7,3,2)
////        //        .reduce(0,(x,y)->x+y);
//                .reduce((x,y)->x+y);
//        Integer sum=optionalsum.get();
//        System.out.println(sum);
            ////--------------------------------------------
//        Optional<String> optionalsum=Stream.of("A","B","C")
//                .reduce((x,y)->x+","+y);
//        System.out.println(optionalsum.get());


        ////--------------------------------count()-----------------------------
//        long count = Stream.of("A","B","C")
//                .count();
//        System.out.println(count);

        ////--------------allMatch(),anyMatch(),nonMatch-----------------------
//        boolean match=Stream.of(1,2,3,4,5,6)
//                .noneMatch(x->x%2==0);  ////it will be opposite  condition if condition is true print false if false print true
////                .anyMatch(x->x%2==0);   ////any one value match condition is true
////                .allMatch(x->x%2==0);  //// any one value is not match condition is false
//        System.out.println(match);

        /////----------------------findfirst()----------------------------------------

//        Integer i=Stream.of(1,2,3,4,5,6,7)
//                .sorted()
//                .findFirst().get();  ////find the fist index value
//
//        System.out.println(i);
        ////-------------------------findAny()------------------
//        Integer find=Stream.of(1,2,3,4,5,6,7)
//
//                .parallel()
//                .findAny()    ////it will be return random index value
//                .get();

//        System.out.println(find);
        ////-----------------------toList()-----------------------------
//        List list=Stream.of(1,2,3,4,5,6,7,8,9)
//                .sorted()
//                .toList();   ///value to list
//        System.out.println(list);
    }
}

package strimeApi;

import java.util.stream.Stream;

public class Practice2 {
    public static void main(String[] args) {
       Stream.of(1,3,5,6,8,7)
               .filter((x->x%2==0))
               .forEach(System.out::println);

// Stream interface one by one data travel
//Stream didN’t store the data
//stream only process the data

//        Stream<Integer> s1= Stream.of(1,3,5,6,8,7);
//       Stream<Integer> filter=s1.filter((x)->x%2==0);
//       filter.forEach(System.out::println);
////-------------------------------------------------------
////    check the null point exception (using .of throw the exception)
//        Stream.of(1,null,3,5,6,7,8)
//                .filter((x)-> x%2==0)
//                .forEach(System.out::println);
////........................................................
        ////using .ofNullable not throw the null point exception
        Stream.ofNullable(null)
                .forEach(System.out::println);
////...................................................................

        ////iterate the value print the 1 to 10
        Stream.iterate(1,(x) -> x<=10,(x) ->x+1)
        .forEach(System.out::println);

        ////iterate the infinity value ----------------------------------
//        Stream.iterate(1,(x)->x+1)
//        .forEach(System.out::println);
        // //---------------------------------------------------

        ////genrate the String value and print the infinity time----------
//        Stream.generate(()->"hello")
//                .forEach(System.out::println);
        ////---------------------------------------------------
    }
}

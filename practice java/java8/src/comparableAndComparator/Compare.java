package comparableAndComparator;

import java.util.Comparator;
import java.util.function.BinaryOperator;

public class Compare {
    public static void main(String[] args) {
        //        Predicate<String> obj = Predicate.isEqual("hello");
//        System.out.println(obj.test("world"));
//
//
//        Predicate<Integer> obj2 = Predicate.isEqual(20);
//        System.out.println(obj2.test(20));

//        Function<String, String> fun = new Function<String, String>() {
//            @Override
//            public String apply(String s) // Sample world
//            {
//                return " hello "+s; // hello sample world
//            }
//        };
//
//
//        Function<String, String> fun1 = new Function<String, String>() {
//            @Override
//            public String apply(String s)// Sample world
//            {
//                return s+" world ";
//            }
//        };
//
//        System.out.println(fun.andThen(fun1).apply("sample"));
//        System.out.println(fun.compose(fun1).apply("sample"));
//
//        Function<String, String> fun3 = Function.identity();
//        System.out.println(fun3.apply("hello"));
        //                  2            1


        ////anonymous class Comparator
//        Comparator<Integer> com = new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2)
//            {
//                if(o1 < o2)
//                {
//                    return -1;
//                }
//                else if(o1 > o2)
//                {
//                    return 1;
//                }
//                return 0;
//            }
//        };

        ////Lambda Expression Comparator
        Comparator<Integer> com=(s1,s2)->Integer.compare(s2,s1);


        BinaryOperator<Integer> obj = BinaryOperator.minBy(com);
        System.out.println(obj.apply(12, 13));

        BinaryOperator<Integer> obj2 = BinaryOperator.maxBy(com);
        System.out.println(obj2.apply(12, 13));
    }
}

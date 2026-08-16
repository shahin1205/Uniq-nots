package lambdaExpression.twoparameter;

import java.util.function.BiPredicate;

public class BiPredicateInterface {
    public static boolean filter(BiPredicate<String,Integer> obj){
        return obj.test("Hello",5);
    }

    public static void main(String[] args) {
//        BiPredicate<String,Integer> obj=new BiPredicate<String, Integer>() {
//            @Override
//            public boolean test(String s,Integer n){
//                return s.length()==n;
//            }
//        };
        System.out.println(filter((s,n)->s.length()==n));
    }
}

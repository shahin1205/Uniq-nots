package functionalSingleParameterized;

import java.util.function.Predicate;

public class PridicateInterface {
    public static boolean isEven(Predicate<Integer> predicate){
        return predicate.test(20);
    }

    public static void main(String[] args) {
        Predicate<Integer> predicate=new Predicate<Integer>(){
            @Override
            public boolean test(Integer n){
                return n%2==0;

            }
        };
        System.out.println(isEven(predicate));
    }
}

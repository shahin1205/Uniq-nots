package defaultMethodInterface;

import java.util.function.Predicate;

public class PridicateInterface {
    public static void main(String[] args) {
        Predicate<Integer> obj=new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {
                return n<10;
            }
        };

        Predicate <Integer> obj1=new Predicate<Integer>() {
            @Override
            public boolean test(Integer n) {
                return n>1;
            }
        };
        System.out.println(obj.and(obj1).test(11));
        System.out.println(obj.or(obj1).test(11));

        System.out.println(obj.or(obj1).negate().test(11));

    }
}

package SummaPractice;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Summa {

    public static Integer map(Function<String,Integer> function){
        return function.apply("Hello world");

    }

    public static void main(String[] args) {
        Function<String ,Integer> function=new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };
        System.out.println(map(function));
    }

}

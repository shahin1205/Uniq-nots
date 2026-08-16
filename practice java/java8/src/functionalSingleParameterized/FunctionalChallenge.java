package functionalSingleParameterized;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class FunctionalChallenge {

    static String s = "Alice, Bob, Charlie, Alice, David, Bob, Eve, Frank, Charlie, Grace";

    static String[] name=s.split(",");

    public static String[] upper(UnaryOperator<String> unaryOperator){
        String [] result=new String[name.length];
        int i=0;
        for (String n:name){
            result[i++]=unaryOperator.apply(n);
        }
        return result;
    }

    public static Integer[] length(Function<String,Integer> function){
        Integer[] result=new Integer[name.length];
        int i=0;
        for(String n:name){
            result[i]=function.apply(n);
            System.out.println(n+"-- " +result[i]);
            i++;
        }
        return result;
    }


    public static void main(String[] args) {

        UnaryOperator<String> unaryOperator=new UnaryOperator<String>(){
            @Override
            public String apply(String s){
                return s.toUpperCase();
            }
        };

        Function<String,Integer> function=new Function<String, Integer>() {
            @Override
            public Integer apply(String s) {
                return s.length();
            }
        };

        System.out.println(Arrays.toString(upper(unaryOperator)));

        Arrays.toString(length(function));
    }
}

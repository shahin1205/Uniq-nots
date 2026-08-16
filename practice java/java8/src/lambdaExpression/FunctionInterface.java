package lambdaExpression;

import java.util.function.Function;

public class FunctionInterface {
    public static Integer map(Function<String ,Integer> function){
        return  function.apply("Hello");
    }
    public static void main(String[] args) {
//        Function<String,Integer> function= new Function<String , Integer>(){
//            @Override
//            public Integer apply(String s){
//                return s.length();
//            }
//        } ;
//        System.out.println(map(function));
        System.out.println(map(s->s.length()));

    }
}


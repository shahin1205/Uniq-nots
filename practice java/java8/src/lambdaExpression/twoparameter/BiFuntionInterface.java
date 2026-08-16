package lambdaExpression.twoparameter;

import java.util.function.BiFunction;

public class BiFuntionInterface {
    public static String map(BiFunction<String,Integer,String> obj){
        return obj.apply("hello",10);
    }

    public static void main(String[] args) {
//        BiFunction<String ,Integer,String> obj=new BiFunction<>(){
//            @Override
//            public String apply(String s,Integer n){
//                return s+n;
//            }
//        };
//        System.out.println(map(obj));

        System.out.println(map((s,n)->s+n));
    }
}

package lambdaExpression;

import java.util.function.UnaryOperator;

public class UnaryOperatorInterface {

    public static String map(UnaryOperator<String> unaryOperator){
        return unaryOperator.apply("Hello");
    }
    public static void main(String[] args) {
//        UnaryOperator<String> unaryOperator=new UnaryOperator<String>(){
//            @Override
//            public String apply(String s){
//                return s.toUpperCase();
//            }
//        };
//        System.out.println(map(unaryOperator));
        System.out.println(map(s->s.toUpperCase()));
    }
}


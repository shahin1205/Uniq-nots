package functionalTwoParameterized;

import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;

public class BinaryOperatoInterface {
    public static String map(BinaryOperator<String> obj) {
        return obj.apply("hello","wolde");
    }

    public static void main(String[] args) {

        BinaryOperator<String> obj = new BinaryOperator<String>() {
            @Override
            public String apply(String s1, String s2) {
                return(s1+" , "+s2).toUpperCase();
            }
      };
        System.out.println(map(obj));
}
}



package lambdaExpression;

import java.util.function.Supplier;

public class SupplierInterface {
    public static String generateValue(Supplier<String> supplier){
        return supplier.get();
    }
    public static void main(String[] args) {
//        Supplier<String> supplier= new Supplier<String>(){
//            @Override
//            public String get(){
//                return "Hello world";
//            }
//        };
//        System.out.println(generateValue(supplier));
        System.out.println(generateValue(()->"Hello World"));
    }
}


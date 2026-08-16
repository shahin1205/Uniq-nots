package lambdaExpression.twoparameter;

import java.util.function.BiConsumer;

public class BiConsumerInterface {
    public static void display(BiConsumer<String ,Integer> obj){
        obj.accept("Raja",10);
    }
    public static void main(String[] args) {
//        BiConsumer<String,Integer> obj=new BiConsumer<>(){
//            @Override
//            public void accept(String s,Integer n){
//                System.out.println(s+ " age is "+n);
//            }
//        };
        display((s,n)->System.out.println(s+" age is "+n));
    }
}

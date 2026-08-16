package lambdaExpression;

import java.util.function.Consumer;

public class ConsumerInterface {
    public static void display(Consumer<String> consumer){
        consumer.accept("Hello world");
    }
    public static void main(String[] args) {
//        Consumer<String> consumer=new Consumer<String> (){
//            @Override
//            public void accept(String s){
//                System.out.println(s);
//            }
//        } ;
//        display(consumer);
        display((s)-> System.out.println(s));
    }
}

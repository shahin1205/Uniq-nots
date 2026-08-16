package methodReference;

import java.util.function.Consumer;

class A{
    public A(String s){
        System.out.println("Hello "+ s);
    }

}
public class MethodReference {
    public static void main(String[] args) {
        Consumer<String> con=A::new;
        con.accept("Sample");
    }
}

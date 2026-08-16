package methodReference;

import java.util.function.Supplier;

class B{
    B(){
        System.out.println("Hello World...");
    }
}

public class MethodReference2 {
    public static void main(String[] args) {
        Supplier<B> supplier=B::new ;
        supplier.get();
    }
}

package packege1;

public class sample2 {

    public static void main(String[] args) {

        sample obj=new sample();
        System.out.println("publick 1"+obj.name);
        System.out.println("protected 1 "+obj.name1);
        System.out.println("defult 1 "+obj.name2);
//
        obj.method();
        obj.method1();
        obj.method2();
        System.out.println("welcome ");
    }
}

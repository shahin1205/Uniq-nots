package packege1;

public class sample {

    public String name = " public ";
    protected  String name1=" protected";
      String name2=" defult";
    private   String name3=" private";

    public void method(){
        System.out.println("publick Method run");
    }
    protected void method1(){
        System.out.println("protected Method run");
    }
     void method2(){
        System.out.println("defult Method run");
    }
    private void method3(){
        System.out.println("private Method run");
    }
    public static void main(String[] args) {
        sample obj=new sample();
        System.out.println("publick 1"+obj.name);
        System.out.println("protected 1 "+obj.name1);
        System.out.println("defult 1 "+obj.name2);
        System.out.println("private 1 "+obj.name3);

        obj.method();
        obj.method1();
        obj.method2();
        obj.method3();
        System.out.println("hello ");
    }
}

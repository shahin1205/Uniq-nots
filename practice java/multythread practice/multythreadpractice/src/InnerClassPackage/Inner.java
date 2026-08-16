package InnerClassPackage;

class OuterClass{
    private int number=10;


    class InnnerClass{

        public void methed1(){

            System.out.println(" Outer class number - "+number);
        }
    }

    class InnerClass2{
        public static  void methed2(){

            OuterClass obj=new OuterClass();
            System.out.println(" Outer class number - "+obj.number);

        }

    }
}


public class Inner {
    public static void main(String[] args) {
        OuterClass out=new OuterClass();
        OuterClass.InnnerClass in1=out.new InnnerClass();
        OuterClass.InnerClass2 in2=out.new InnerClass2();

        in1.methed1();
        OuterClass.InnerClass2.methed2();

    }

}

package package1;

//abstract class Demo{
//    Demo(){
//        System.out.println("cons inside the abstraction");
//    }
//}
class Demo{
    int a=10;
    void method()
    {

    }
}

class Sample{
    Demo ob;
    Sample(Demo ob){
        this.ob=ob;
    }
    void method1(){
        System.out.println(ob.a);
        ob.method();
    }
}
//public class constrctor2 extends Demo{
public class constrctor2 extends Demo{
    final int a;
    constrctor2(){
        a=100;
        System.out.println(a);
    }
    constrctor2(int a1){
        a=a1;
        System.out.println(a);

    }
    public static void main(String[] args) {
//        constrctor2 ob=new constrctor2();
//        constrctor2 ob1=new constrctor2(50);

        Demo obj=new Demo();
        Sample ob=new Sample(obj);

    }
}

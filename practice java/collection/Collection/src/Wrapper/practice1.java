package Wrapper;

public class practice1 {
    Integer a=10;
    Boolean bl=true;

    public  Integer add(){
        System.out.println("Integer value");
        return 0;
    }
    public int add1(){
        for (Integer i =0; i<=10; i++) {
            System.out.println("int value parametter Integer" + i);

        }
        return 0;
    }
    public Integer add2(int v){
        System.out.println(" Integer value parameeter has Int " +v);
        return 0;
    }

    public static void main(String[] args) {

        practice1 p1=new practice1();
        System.out.println(p1.a);
        System.out.println(p1.bl);

        p1.add();
        p1.add1();
        p1.add2(30);

        Thread t1=new Thread() {
            practice1 p2 = new practice1();
            practice1 p3 = new practice1();
            practice1 p4 = new practice1();
            practice1 p5 = new practice1();
        };














//        //Boxing
//        Integer i=10;
//        System.out.println(i);
//        Integer y=i;
//        System.out.println(y);
//         y=30;
//        System.out.println(y);
//        System.out.println(i);
//        int y=Integer.valueOf(i);
//        System.out.println(y);

        //autoboxing no need to call value of method automatically

//        int a=10;
//        Integer b=a;
//
        //unboxing
//        Integer c=20;
//        int d=c.intValue();

//        AutoUnboxing
//        Integer c=20;
//        int d=c;



    }
}

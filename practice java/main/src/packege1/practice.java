package packege1;

import java.util.Scanner;

class Thread1 extends Thread{
    @Override

    public void run(){
        for(int i=0 ;i<=10 ;i++){
            System.out.println("Thread - "+ i);
        }
    }
}
public class practice  {
    //variable
//    int var1=1000;
//    static int var2=2000;
    public static void main(String[] args) {

        Thread1 t1=new Thread1();
//        Thread1 t1=new Thread1();
        t1.setPriority(1);

        Thread.currentThread().setName("Shahin");

        t1.start();

        System.out.println("main thread  - " + Thread.currentThread().getName());

















//String s1="java";
//String s2 =new String("java");
//        System.out.println(s1==s2);
//        System.out.println(s1.equals(s2));/
//        System.out.println("method 2");
//        s2=s2.intern();
//        System.out.println(s1==s2);
//        System.out.println(s1.equals(s2));

//        String ob=new String("shin");
//        System.out.println(ob);


        //variable
//        practice obj=new practice();
//        System.out.println("instans"+ obj.var1);
//        System.out.println("static"+var2);
//        obj.var1=111;
//        var2=222;
//        System.out.println("instans :"+ obj.var1);
//        System.out.println("static :"+var2);
//        practice obj1=new practice();
//        System.out.println("instans :"+ obj1.var1);
//        System.out.println("static :"+var2);
//        System.out.println("hello");

    }
}

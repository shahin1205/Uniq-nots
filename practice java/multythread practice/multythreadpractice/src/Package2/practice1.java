package Package2;

import java.util.Scanner;

class Res
{
    public synchronized void add(int ch)
    {
        System.out.println("Hello - "+Thread.currentThread().getName());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if(ch == 1)
        {
            System.out.println(Thread.currentThread().getName() + " - is now waiting");
            try {
                wait();                  //wait is a obj class so that here daractly called wait() method syndex: super.wait()
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(Thread.currentThread().getName() + " - is now back to execution...");
        }
        else {
            System.out.println(Thread.currentThread().getName()+" - is called notify");
            notify();
            System.out.println(Thread.currentThread().getName()+" - after called notify");
        }

        System.out.println("end - "+Thread.currentThread().getName());
    }
}

class Thread1 extends Thread{
    Res res;
    int noty;
    Thread1( Res res, int noty){
        this.noty=noty;
        this.res=res;
    }
    public void run()
    {
        try {
            res.add(noty);
        }
        catch (Exception e){

        }
    }
}

public class practice1 {
    public static void main(String[] args) {
        Res res = new Res();
        Thread1 t1=new Thread1(res,1);
        Thread1 t2=new Thread1(res,0);


//        Thread t1 = new Thread(()->
//        {
//            res.add("wait");
//        });
//
//        Thread t2 = new Thread(()->
//        {
//            res.add("null");
//        });



        t1.setName("t1");// wait
        t2.setName("t2");// notify

        t1.start();
        t2.start();


    }
}

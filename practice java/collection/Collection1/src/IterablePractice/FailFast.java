package IterablePractice;

import java.util.ArrayList;
import java.util.Iterator;

class Fail{
    ArrayList<Integer> arr=new ArrayList<>();
   public synchronized void  add(){
        arr.add(1);
        arr.add(2);
        arr.add(3);
    }

}

class T1 extends Thread{

    Fail fail;
    T1(Fail fail){
        this.fail=fail;
    }
public void run(){
        fail.add();
    Iterator at=fail.arr.iterator();
    while (at.hasNext()){
        System.out.println("Get the value "+at.next());
    }
}
}

class T2 extends Thread{

    Fail fail;
    T2(Fail fail){
        this.fail=fail;
    }
    public void run(){
        fail.add();
        Iterator at=fail.arr.iterator();
        while (at.hasNext()){
            fail.arr.add(13);
            System.out.println("Set the value "+at.next());
        }
    }
}
public class FailFast {
    public static void main(String[] args) {

        Fail fail=new Fail();
        T1 t1=new T1(fail);
        T2 t2=new T2(fail);

        t1.start();
        t2.start();

    }
}

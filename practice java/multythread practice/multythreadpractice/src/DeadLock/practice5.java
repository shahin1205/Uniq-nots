package DeadLock;


class Res1{

    private Res2 r2;

    public Res1 (){

    }
    public void setRes2(Res2 r2){
        this.r2=r2;

    }

    public  synchronized void add(){
        System.out.println(Thread.currentThread().getName()+" - is entered add");
        r2.sub();
        System.out.println(Thread.currentThread().getName()+" - is exit add");
    }
}
class Res2{
    private Res1 r1;
    public Res2(){

    }

    public void setRes1(Res1 r1 ){
        this.r1=r1;

    }

    public synchronized void sub(){
        System.out.println(Thread.currentThread().getName()+" - is entered sub");
        r1.add();
        System.out.println(Thread.currentThread().getName()+" - is exit sub");
    }
}

class Thread1 extends Thread{
    Res1 res1;
    Thread1(Res1 res1){
        this.res1=res1;
    }
    @Override
    public void run(){
        res1.add();
    }

}
class Thread2 extends Thread{
    Res2 res2;
    Thread2 (Res2 res2){
        this.res2=res2;
    }

    @Override
    public void run(){
        res2.sub();
    }
}


public class practice5 {
    public static void main(String[] args) {

        Res1 r1=new Res1();
        Res2 r2=new Res2();

        r1.setRes2(r2);
        r2.setRes1(r1);

        Thread1 t1=new Thread1(r1);
        Thread2 t2=new Thread2(r2);

        t1.start();
        t2.start();

    }
}

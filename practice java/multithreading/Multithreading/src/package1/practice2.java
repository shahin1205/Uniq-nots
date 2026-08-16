package package1;

class Multithrd2 implements Runnable{
    public void run(){
        for (int i=0;i<10;i++){
            System.out.println("Runnable interface");
        }
    }
}
public class practice2 extends Thread {

    public void run(){
        for (int i=0;i<10;i++){
            System.out.println("hi");
        }
    }

    public static void main(String[] args) {

        practice2 ob=new practice2();
        ob.start();
        for (int i=0;i<10;i++){
            System.out.println("hello...");
        }
        Multithrd2 obj=new Multithrd2();
        Thread t1=new Thread(obj);
        t1.start();
    }
}

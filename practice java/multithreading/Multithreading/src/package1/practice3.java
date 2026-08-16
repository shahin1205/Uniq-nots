package package1;


class Two extends Thread{
    public void run(){
        for(int i=0; i<3; i++){
//            System.out.println("second run method");
            System.out.println(Thread.currentThread().getName());

        }
    }
}
public class practice3 extends  Thread {
    public void run(){
        for(int i=0; i<3; i++){
//            System.out.println("fist run method");
            System.out.println(Thread.currentThread().getName());

        }
//        System.out.println(Thread.currentThread().getName());

    }
    public static void main(String[] args) {
        practice3 ob=new practice3();
        Two t=new Two();
        ob.start();
        t.start();


        ob.setName("fist thread");
        t.setName("second thread");
        t.setPriority(10);
        ob.setPriority(2);
//        Thread.currentThread().setName("Root Thread");
//        System.out.println("Main thread");
//        System.out.println(Thread.activeCount());
//        System.out.println(ob.getName());
//        System.out.println(t.getName());
//        System.out.println(Thread.currentThread().getName());


    }
}

package AnonymousThread;


public class AnonymousThread {
    public static void main(String[] args) {
        Runnable r1=new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable r1............."+ Thread.currentThread().getName());
            }
        };
        Runnable r2=new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable r2 ............. ");
            }
        };

        Thread t1=new Thread(){
            public void run(){
                System.out.println("Thread 1 ....................");
            }
        };

        Thread t2=new Thread(){
            public void run(){
                System.out.println("Thread 2...................");
            }
        };
        Thread run1=new Thread(r1);
        Thread run2=new Thread(r2);

        run1.setName("Runnable 1");
        run2.setName("Runnable 2");

        t1.setName("Thread 1");
        t2.setName("Thread 2");
        run1.start();
        run2.start();

        t1.start();
        t2.start();
    }
}

package package3;

class Ras{
    public synchronized void add(int ch) {

            for (int i = 0; i <= 10; i++) {

            if (ch == 1) {
                System.out.println(Thread.currentThread().getName());

                try {
                    wait();                  //wait is a obj class so that here daractly called wait() method syndex: super.wait()
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            } else {
                notify();

            }
            if (ch == 1) {
                ch = 0;

            } else {
                ch = 1;
            }
        }
//    }
    }

}

class Thread1 extends Thread{
    Ras ras;
    int noty;
    Thread1 (Ras ras,int noty ){
        this.ras=ras;
        this.noty=noty;
    }
    @Override
    public void run(){
        ras.add(noty);
    }
}
public class practice3 {
    public static void main(String[] args) {
        Ras ras=new Ras();
        Thread1 thread1=new Thread1(ras,1);
        Thread1 thread2=new Thread1(ras,0);

        thread1.setName("one");
        thread2.setName("two");

        thread1.start();
        thread2.start();

    }
}


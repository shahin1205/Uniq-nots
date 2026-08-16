package packageDaemon;

class Thread1 extends Thread{
@Override
public void run(){
        for(int i=1; i>=0;i++){
            System.out.println("Thread - "+ i);
        }
    }

}


public class Daemon {
    public static void main(String[] args) {

        Thread1 t1=new Thread1();
        t1.setDaemon(true);
        t1.start();

        for(int i=0; i<=10;i++){
            System.out.println(i + " -main");


        }


        System.out.println();

    }
}

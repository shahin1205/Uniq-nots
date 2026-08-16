package package1;
class A extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("Hay Hello");
            try {
                Thread.sleep(10);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class B extends Thread{
    public void run()
    {
        for(int i=0;i<50;i++){
            System.out.println(" Okay bye");
            try {
                Thread.sleep(10);
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }

        }
    }

}
public class Threpractice {
    public static void main(String[] args) {
        A a1=new A();
        B b1=new B();
        b1.setPriority(10);
        a1.setPriority(2);
        a1.start();
        b1.start();
    }
}

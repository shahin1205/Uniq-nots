package package1;

public class practice4 extends Thread{
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            }
            catch (InterruptedException e){
//                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        practice4 ob=new practice4();
        ob.start();
    }
}

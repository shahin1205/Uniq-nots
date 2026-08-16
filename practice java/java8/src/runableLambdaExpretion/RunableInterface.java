package runableLambdaExpretion;

public class RunableInterface {
    public static void main(String[] args) {
        //        Runnable myRunable=new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("Thread ");
//            }
//        };
//
//        Thread myThread=new Thread(myRunable);
//        myThread.start();

        Runnable myRun=()-> System.out.println("Thread");
        Thread myThread=new Thread(myRun);
        myThread.start();
    }
}

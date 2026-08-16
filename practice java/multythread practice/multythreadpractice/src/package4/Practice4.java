package package4;


class Bus{
    int seat=10;
    public synchronized void bookSeats(int seatcount){
        while (seat<seatcount){
            System.out.println(Thread.currentThread().getName() + " Waiting for a seat"+ "\n");
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        seat -=seatcount;
        System.out.println(Thread.currentThread().getName() + " seat booked -" + seatcount );
        System.out.println("Available seat - " + seat + "\n");

    }
    public synchronized void cancelseat(int seatcount ,int cancelseatcount) {


        int addcancelseat=seatcount-cancelseatcount;
    seat+=cancelseatcount;
    seatcount -=cancelseatcount;
        System.out.println(Thread.currentThread().getName() + " canceled " + cancelseatcount + " seat");
        System.out.println("Now " +Thread.currentThread().getName() + " seatcount is -" + seatcount );

        System.out.println("Available seat -"+ seat +"\n");

        notify();
    }
}

class Thread1 extends Thread{
    Bus bus;
    int seatcount;
    int cancelseatcount;
    String cancel;

    Thread1(Bus bus, int seatcount,String cancel , int cancelseatcount){
        this.bus=bus;
        this.seatcount=seatcount;
        this.cancel=cancel;
        this.cancelseatcount=cancelseatcount;
    }

    @Override
    public void run(){
        bus.bookSeats(seatcount);
        if(cancel=="cancel") {
            try {
                Thread.sleep(5000);  // 5 sec delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            bus.cancelseat(seatcount,cancelseatcount);
        }
    }
}




public class Practice4 {
    public static void main(String[] args) {
        Bus bus=new Bus();

        Thread1 thread=new Thread1(bus, 5 , "nil",0);
        Thread1 threa2=new Thread1(bus, 3, "nil",0);
        Thread1 thread3=new Thread1(bus, 5,"cancel",3);

        thread.setName("Mohammed");
        threa2.setName("Raja");
        thread3.setName("Muthu");

        thread.start();
        threa2.start();
        thread3.start();





    }
}


























































//
//if(seat>=seatcount){
//seat -=seatcount;
//
//            System.out.println(Thread.currentThread().getName()  + " seat booked " + seatcount);
//        System.out.println("avalable seat -" + seat);
//
//            try {
//wait();
//            } catch (InterruptedException e) {
//        throw new RuntimeException(e);
//            }
//
//                    }
//                    else {
//                    System.out.println("seats can't booked ");
////            wait();
//
//        }
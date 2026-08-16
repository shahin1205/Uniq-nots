package package1;
class Bus{

private int seat = 5;

public synchronized void bookSeats(int seatCount) throws InterruptedException {
    System.out.println("enter - " +" seat count :"+seat+" - "+Thread.currentThread().getName());

    if(seat >= seatCount)
    {
//        Thread.sleep(2000);
        seat -= seatCount;
    }
    else
    {
        System.out.println("can't book seats...");
    }
    System.out.println("exit - " +" seat count :"+seat+" - "+Thread.currentThread().getName());
}

public void checkSeatAvailability()
{
    System.out.println(seat);
}

}


class Person extends Thread
{
    private Bus bus;
    private int seatCount;

    public Person(Bus bus,int seatCount)
    {
        this.bus = bus;
        this.seatCount = seatCount;
    }

    @Override
    public void run()
    {
        try {
            bus.bookSeats(seatCount);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

public class practice6 {
    public static void main(String[] args) throws InterruptedException {

        Bus bus = new Bus();
        Person personA = new Person(bus, 3);
        Person personB = new Person(bus, 2);
        Person personC = new Person(bus, 3);
        personA.setName("personA");
        personB.setName("personB");
        personC.setName("personC");


        personA.start();
        personB.start();
        personC.start();

        personA.join();
        personB.join();
        personC.join();

        bus.checkSeatAvailability();

    }
}

package VectorPractice;


import java.util.Vector;

class Train{
    private Vector<String> seats=new Vector<String>();
    Train(){
        seats.add("Seat - 1");
        seats.add("Seat - 2");
        seats.add("Seat - 3");
        seats.add("Seat - 4");
        seats.add("Seat - 5");
    }
    public void bookseat(){
        if(!seats.isEmpty()){
            String seat=seats.remove(0);
            System.out.println(Thread.currentThread().getName()+"-"+seat);
        }else{
            System.out.println("no seats available ");
        }
    }
}

class User extends  Thread{
    private Train train;
    public User(Train train){
        this.train=train;
    }
    @Override
    public void run(){
        train.bookseat();
    }
}
public class VectorSample2 {
    public static void main(String[] args) {
        Train train=new Train();
        User u1=new User(train);
        User u2=new User(train);
        User u3=new User(train);
        User u4=new User(train);
        User u5=new User(train);
        User u6=new User(train);

        u1.setName("Shahin");
        u2.setName("Mohammed");
        u3.setName("Ali");
        u4.setName("Aravind");
        u5.setName("Raja");
        u6.setName("kumar");

        u1.start();
        u2.start();
        u3.start();
        u4.start();
        u5.start();
        u6.start();

    }
}

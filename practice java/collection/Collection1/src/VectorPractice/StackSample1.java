package VectorPractice;

import java.util.Stack;


class Trains{
    private Stack<String> seats=new Stack<String>();
    Trains(){
        seats.push("Seat - 1");
        seats.push("Seat - 2");
        seats.push("Seat - 3");
        seats.push("Seat - 4");
        seats.push("Seat - 5");
    }
    public void bookseat(){
        if(!seats.isEmpty()){
            String seat=seats.pop();
            System.out.println(Thread.currentThread().getName()+"-"+seat);
        }else{
            System.out.println("no seats available ");
        }
    }
}

class Users extends  Thread{
    private Trains train;
    public Users(Trains train){
        this.train=train;
    }
    @Override
    public void run(){
        train.bookseat();
    }
}

public class StackSample1 {
    public static void main(String[] args) {
        Trains train=new Trains();
        Users u1=new Users(train);
        Users u2=new Users(train);
        Users u3=new Users(train);
        Users u4=new Users(train);
        Users u5=new Users(train);
        Users u6=new Users(train);

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

package abstrac;

abstract class Bank{
   abstract void loan();
   abstract void account();
    void atm(){
        System.out.println("get your atm");
    }
}

class  Home extends Bank {
    void loan(){
        System.out.println("home lone");
    }
    void account(){
        System.out.println("saving account");
    }
}
class Educ extends Bank{
    void loan(){
        System.out.println("education lone");
    }
    void account(){
        System.out.println("student account");
    }
}

public class abstraction {
    public static void main(String[] args) {

        Home ob=new Home();
        Educ ob1=new Educ();
        ob.loan();
        ob.account();
        ob.atm();
        ob1.loan();
        ob1.account();
        ob1.atm();
    }
}

package abstrac;

interface bank{
    void account();
}
    interface trans extends bank{
        void pay();
        void send();
    }
    class data{
     void userdata(){
         System.out.println("i am a shahin");
     }
    }
    class Gpay extends data implements trans{
        public void account(){
            System.out.println("saving account");
        }
        public void pay(){
            System.out.println("paying with a Gpay");
        }
        public void send(){
            System.out.println("sending amount Gapy");
        }

    }
    class Phonepe implements trans{
        public void account (){
            System.out.println("Salary account");

        }
        public void pay(){
            System.out.println("paying with a phonepe");
        }
        public void send(){
            System.out.println("sending amount phonepe");

        }
    }
public class abstracinter {
    public static void main(String[] args) {
        Gpay ob=new Gpay();
        Phonepe obj=new Phonepe();
        ob.pay();
        ob.send();
        ob.account();
        obj.pay();
        obj.pay();
        obj.account();
    }

    }

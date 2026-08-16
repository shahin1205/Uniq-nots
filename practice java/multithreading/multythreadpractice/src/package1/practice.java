package package1;


class Bank{
    int balance=2000;
    public synchronized void deposit(int depositeAmout) throws InterruptedException{
        if (depositeAmout>0) {
            System.out.println(Thread.currentThread().getName()+ ", "+depositeAmout + " Amount was deposit your account ");
//          Thread.sleep(2000);
            balance += depositeAmout;

            System.out.println(Thread.currentThread().getName()+", know your balance is : "+balance);
            System.out.println();
        }else {
            System.out.println("please enter the correct amount" );
            System.out.println();
        }
    }
    public synchronized void withdraw (int withdrawAmount){
        if(balance>=withdrawAmount){
            System.out.println(Thread.currentThread().getName()+ ", "+withdrawAmount + " Amount was withdraw you account ");

            balance -=withdrawAmount;
            System.out.println(Thread.currentThread().getName()+" know your balance is : " + balance);
            System.out.println();


        }else {
            System.out.println(Thread.currentThread().getName()+" Enter amount :"+withdrawAmount +" balance is insafisiant");
        }
//        System.out.println();
//        System.out.println(balance);
    }
}
    class Deposit extends Thread {
        Bank bank;
        int depositamount;
        Deposit(Bank bank,int depositamount){
            this.bank=bank;
            this.depositamount=depositamount;
        }
        @Override
        public  void run()
        {
            try {
                bank.deposit(depositamount);
            }
            catch (Exception e){
            }
        }

    }
    class Withdraw extends Thread{

        Bank bank;
        int withdrawamount;
        Withdraw(Bank bank,int withdrawamount){
            this.bank=bank;
            this.withdrawamount=withdrawamount;

        }
        @Override
        public  void run()
        {
            try {
                bank.withdraw(withdrawamount);
            }
            catch (Exception e){

            }
        }

    }



public class practice {
    public static void main(String[] args)throws  InterruptedException {

        Bank bank=new Bank();
        Deposit dep=new Deposit(bank,1000);
        Deposit dep1=new Deposit(bank,3000);

        Withdraw with=new Withdraw(bank,2000);
        Withdraw with1=new Withdraw(bank,4000);


        dep.setName("shahin");
        dep1.setName("ali");
        with.setName("shahin");
        with1.setName("ali");

        dep.setPriority(10);
        with.setPriority(10);

        dep.start();
        dep1.start();
        with.start();
        with1.start();

        dep.join();
        dep1.join();
        with.join();
        with1.join();
    }
}

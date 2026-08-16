package InnerClassPackage2;

class Bank{
    private int balance =1000;
    static class Payment{
        public  void widh(String name, int amount){
            Bank bank=new Bank();
            System.out.println("enter the person - " + name);
            bank.balance-=amount;
            System.out.println(name+" Widh the amount " +amount);
            System.out.println(" Balance - "+ bank.balance);
        }
        public void depo(String name, int amount){
            Bank bank=new Bank();
            System.out.println(name+" - Depo the amount " + amount);
            bank.balance+=amount;
            System.out.println(name+ " - Depo Amount " +amount );
            System.out.println(" now your balance is " + bank.balance);
        }
        class Payment2{
            String name;
            int amount;
            Payment2(String name ,int amount){
                this.amount=amount;
                this.name=name;

            }
        }

    }
}

public class InnerclassBank {
    public static void main(String[] args) {
        Bank bank=new Bank();
        Bank.Payment payment=new Bank.Payment();

        payment.widh("shahin",1000);
        payment.depo("shahin" ,2000);

    }
}

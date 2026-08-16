package enumChallege;

import java.util.Scanner;

enum Status{
    SUCCESS(10," PAYMENT SUCCESS FULL"),
    BENDING(5, " PAYMENT BENDING"),
    FAILURE(1, " PAYMENT FAILURE");
    private int priority;
    private String paymentStatus;

    Status(Integer priority,String paymentStatus){
        this.priority=priority;
        this.paymentStatus=paymentStatus;
    }
    public int getPriority(){
        return this.priority;
    }
    public String getPaymentStatus(){
        return this.paymentStatus;
    }

}
class PaymentGatWay{
    Scanner sc=new Scanner(System.in);
    double balance=20000;
    void payment(){
        System.out.println("Enter the payment");
        double getpayment=sc.nextDouble();
        if(balance>getpayment){
            Status success=Status.SUCCESS;
            System.out.println(success);
        }else if (balance<getpayment){
            Status failure=Status.FAILURE;
            System.out.println(failure);
        }

    }
}
public class Main {
    public static void main(String[] args) {

        PaymentGatWay paymentGatWay=new PaymentGatWay();
        paymentGatWay.payment();

    }
}

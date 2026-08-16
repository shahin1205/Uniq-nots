package FactoryAbstract;

import java.util.Locale;



interface PaymentGatway{
    Payment makePayment();
    Refund makeRefund();
}
interface Payment{
    void pay(int amt);
}
interface Refund{
    void refund(int amt);
}


class PayPayment implements Payment{
    @Override
      public void pay(int amt){
        System.out.println("Payment success fully - " +amt);
    }
}
class PayRefund implements Refund{
    public void refund(int amt){
        System.out.println("Refund refund success fully - " + amt);
    }
}
class GpayService implements PaymentGatway{
    @Override
    public Payment makePayment(){
        System.out.println("Gay Payment ");
        return new PayPayment();
    }
    @Override
    public Refund makeRefund(){
        System.out.println("Gpay refund");
        return new PayRefund();
    }
}

class  PaymentService implements PaymentGatway{
    @Override
    public Payment makePayment(){
        return new PayPayment();
    }
    @Override
    public Refund makeRefund(){
        return new PayRefund();
    }

    class PaymentGatwayFactory{
        public static PaymentGatway getPaymentGatway(String payment){

            switch (payment.toLowerCase()){
                case "paypal":
                    return new PaymentService();
                case "gpay":
                    return new GpayService();
            }

            return null;
        }
    }
}
public class FactoryAbstrac {
    public static void main(String[] args) {


        PaymentGatway gatway = PaymentService.PaymentGatwayFactory.getPaymentGatway("Paypal");

        Payment payment = gatway.makePayment();
        payment.pay(30);
        Refund refund = gatway.makeRefund();
        refund.refund(50);

        PaymentGatway gatway1 = PaymentService.PaymentGatwayFactory.getPaymentGatway("gpay");

        Payment payment1 = gatway.makePayment();
        payment.pay(40);
        Refund refund1 = gatway.makeRefund();
        refund.refund(60);



    }
}
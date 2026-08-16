package Exception;
class LimitReachedException extends Exception{
    LimitReachedException(){
        super();
    }
    LimitReachedException(String s){
        super(s);
    }
}
public class throwthrows {
    int balance=100000;
    int limt=5000;
    void widthra(int widamt) throws LimitReachedException {
        if(widamt>limt){
            throw new LimitReachedException("Limit reached");
        }
        else {
            balance-=widamt;
            System.out.println("widthrawl success");
        }
    }
    public static void main(String[] args) throws LimitReachedException {
        throwthrows ob=new throwthrows();
        ob.widthra(7000);
        System.out.println("thank you");


    }
}

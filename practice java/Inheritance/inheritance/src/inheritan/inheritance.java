package inheritan;

    class display {
        display(){
            System.out.println("parent class");
        }
        String name="shahin";
        void show(){
            System.out.println("hello welcome");
        }
    }
    class user extends display{
        user(){
            System.out.println("chiild class");
        }
        void chmeth(){
            show();
            System.out.println(name);

        }
    }
public class inheritance {

    public static void main(String[] args) {
        user ob=new user();
        ob.chmeth();
    }
}

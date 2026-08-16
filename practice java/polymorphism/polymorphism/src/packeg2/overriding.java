package packeg2;
class app{
    int a=12;
    int b=4;
    public void display(){

        System.out.println(a+b);
        System.out.println("helloooo");
    }
}
class app2 extends app{
   int a=10;
    public void display(){
        System.out.println(a +b);
        System.out.println("wellcome");

    }
}
public class overriding {
    public static void main(String[] args) {
        app2 ob=new app2();
        ob.display();
    }
}

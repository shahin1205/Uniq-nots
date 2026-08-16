package packege1;

public class methods {
    // method

    public void add(){
        int a=10;
        int b=20;

        System.out.println("add value :"+ (a+b));
    }
    public void sub(int c,int d){
        System.out.println("sub value : "+(c+d));

    }
    public int meth1(){
        int a=10;
        int b=20;
        return a+b;
    }
    public static int math2(int a,int b){

        return a+b;
    }
    public static void main(String[] args) {
        methods ob=new methods();
        ob.add();
        ob.sub(40,60);
        System.out.println("math1 : "+ob.meth1());
        System.out.println("math2 : "+math2(60,70));


    }
}

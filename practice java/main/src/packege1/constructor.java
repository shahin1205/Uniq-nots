package packege1;

public class constructor {
    int roolNo;
    String name;
    constructor(int roolno1,String name1){
        roolNo=roolno1;
        name=name1;
        System.out.println("stutend "+name+" details collected ");

    }
    public static void main(String[] args) {
        constructor ob=new constructor(11,"shain");
        constructor ob1=new constructor(13,"mahinn");
        System.out.println(ob.name);
        System.out.println(ob.roolNo);

    }
}

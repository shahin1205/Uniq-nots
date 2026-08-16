package sample1;

class Program1{
    int id=12;
    String name="shahin";
}


class Program2 extends Program1 {
    void user(){
        System.out.println(id);
    }
}
public class Sample1 {
    public static void main(String[] args) {
        Program2 p2=new Program2();
//        p2.user();
        System.out.println(p2.id);

    }
}

package package1;


class student1{
    student1(){
        this("hello");
        System.out.println("Student class constructor ");
    }
    student1(String s){
        this(30);
        System.out.println(s);
    }
    student1(int a){
        System.out.println(a+" 3 constructor");
    }


    int mark=90;
    void data(){
        System.out.println("I am a student");
    }
}

class School extends student1{
    School(){
        super();
//        super("parameterize constructor ");
        System.out.println("School class constructor ");
    }
    void studentdata(){
        data();
    }
}
public class Constructor {
    public static void main(String[] args) {
        School ob=new School();
        ob.studentdata();
        System.out.println(ob.mark);

    }
}

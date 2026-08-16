package AnonymousIneerClass;
class Project1{
    void method1() {
        System.out.println(" claass ......");
    };
}
public class Anonymous {
    public static void main(String[] args) {

        Project1 project1=new Project1(){
            public void method1(){
//                System.out.println(" Main class");
            }
        };
        project1.method1();


    }
}

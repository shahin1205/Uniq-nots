package composition;
class studend{
    String name;
    Address obj;
    studend(String name,Address obj){
        this.name=name;
        this.obj=obj;
        }
    void details(){
        System.out.println(name+" "+ obj.no+" "+obj.street+" "+obj.city);
    }
}
class Address{
    int no;
    String street;
    String city;
    Address(int no, String street,String city){
        this.city=city;
        this.no=no;
        this.street=street;
    }
}
public class hasacomp {
    public static void main(String[] args) {
        studend ob=new studend("shahin",new Address(2,"1st street","chennai"));
        ob.details();
    }
}

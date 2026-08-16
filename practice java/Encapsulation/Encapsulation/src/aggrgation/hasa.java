package aggrgation;
class lib{
    books ob;
    void collofbooks(books ob){
        this.ob=ob;
        System.out.println(ob.s+" "+ob.s1);
        System.out.println(ob.s2+" "+ob.s3);
    }
}
class books{
    String s="book1";
    String s1="book2";
    String s2;
    String s3;
    books(String s2,String s3){
        this.s2=s2;
        this.s3=s3;
    }
}
public class hasa {
    public static void main(String[] args) {
        books obj=new books("book3","book4");
        System.out.println(obj.s);
        lib ob=new lib();
        ob.collofbooks(obj);

    }
}

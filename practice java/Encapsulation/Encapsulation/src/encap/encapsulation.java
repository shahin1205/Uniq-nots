package encap;

public class encapsulation {
    private int pass;
    private String username;

    encapsulation(int pass, String username){
        this.pass=pass;
        this.username=username;
    }
    public int getPass(){
        return pass;
    }
    public String getUsername(){
        return username;
    }
    public void setPass(int pass){
        this.pass=pass;
    }
    public void setUsername(String username){

        this.username=username;
    }
    public static void main(String[] args) {
        encapsulation ob=new encapsulation(123,"shahin");
        System.out.println("passwored : " + ob.getPass());
        System.out.println("user name : " + ob.getUsername());
        ob.setPass(5678);
        ob.setUsername("mahin");
        System.out.println("passwored : " + ob.getPass());
        System.out.println("user name : " + ob.getUsername());
    }
}

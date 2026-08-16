package enueChallenge2;


import javax.management.relation.Role;
import java.util.Arrays;

class User{
    String userName;
    String password;
    String email;
    long mobileNo;
    Roles roles;
    User(String userName,String password, String email,long mobileNo ,Roles roles){
        this.userName=userName;
        this.password=password;
        this.email=email;
        this.mobileNo=mobileNo;
        this.roles=roles;
    }

    @Override
    public String toString() {
        return
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", mobileNo=" + mobileNo +
                ", roles=" + roles ;
    }
}
enum Roles{
    USER(Access.READ),
    MANAGER(Access.READ,Access.WRITE),
    ADMIN(Access.READ,Access.WRITE),
    SUPER_ADMIN(Access.READ,Access.WRITE);

    private Access[] access;
    Roles(Access...access){
        this.access=access;
    }
    public Access[] getAccess(){
        return access;
    }

}

enum Access{
    READ,
    WRITE;
}
public class EnumChallenge2 {
    public static void main(String[] args) {

        User user=new User("Shahin","Shahin","shain@gmail",123456,Roles.USER);
        User user1=new User("mahin","Mahin","mahin@gmail",123456,Roles.USER);
        User user2=new User("mohammed","Mohammed","mohammed@gmail",123456,Roles.SUPER_ADMIN);
        User user3=new User("ali","Ali","ali@gmail",123456,Roles.ADMIN);
        User user4=new User("raja","Raja","raja@gmail",123456,Roles.MANAGER);

        System.out.println(user+" - "+user.roles + " " + Arrays.toString(user.roles.getAccess()));
        System.out.println(user1+" - "+user1.roles + " " + Arrays.toString(user1.roles.getAccess()));
        System.out.println(user2+" - "+user2.roles + " " + Arrays.toString(user2.roles.getAccess()));
        System.out.println(user3+" - "+user3.roles + " " + Arrays.toString(user3.roles.getAccess()));
        System.out.println(user4+" - "+user4.roles + " " + Arrays.toString(user4.roles.getAccess()));

}
}


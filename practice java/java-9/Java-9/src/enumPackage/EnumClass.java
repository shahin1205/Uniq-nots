package enumPackage;

enum Roles{
    ADMIN(10," All access"),
    MANAGER(5," Limited access"),
    USER(1," only for read ");

    private int priority;
    private String access;

    Roles (Integer priority,String access){
        this.priority=priority;
        this.access=access;
    }
    public int getPriority(){
        return  this.priority;
    }
    public String getAccess(){
        return this.access;
    }

}
public class EnumClass {
    public static void main(String[] args) {
        Roles role=Roles.ADMIN;

        System.out.println(role.getPriority()+role.getAccess());

//        System.out.println(role.ordinal());
//        System.out.println(Roles.USER==Roles.USER);
    }

}

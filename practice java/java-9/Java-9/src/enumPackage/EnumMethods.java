package enumPackage;

enum Role{
    ADMIN(10,"All access"),
    MANAGER(5,"Limited access"),
    USER(1,"read only");
    private int priority;
    private String access;
    Role(int priority,String access){
        this.priority=priority;
        this.access=access;
    }
    public int getPriority(){
        return this.priority;
    }
    public String getAccess(){
        return this.access;
    }
}

public class EnumMethods {
    public static void main(String[] args) {

        ////values() method
//        Role[] role = Role.values();
//        for (Role role1:role){
//            System.out.println(role1);
//        }

            ////valueOf method
//        Role role=Role.valueOf("ADMIN");
//        System.out.println(role);

            ////name() method
//         Role role=Role.ADMIN;
//        String r= role.name();
//        System.out.println(r);

            ////toString() method
//        Role[] role=Role.values();
//        String r=" ";
//        for(Role role1:role){
//            r=r +" , "+role1.toString();
//        }
//        System.out.println(r);

        ////equals() method
//        System.out.println(Role.ADMIN.equals(Role.MANAGER));

        ////compareTo()
//        System.out.println(Role.ADMIN.compareTo(Role.MANAGER));

        ////getDeclaringClass() method
        System.out.println(Role.ADMIN.getDeclaringClass());
    }
}

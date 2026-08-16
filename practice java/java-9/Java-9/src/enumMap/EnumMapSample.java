package enumMap;

import java.util.EnumMap;

enum Roles {
    SUPER_ADMIN,
    MANAGER,
    USER,
    ADMIN
}
public class EnumMapSample {
    public static void main(String[] args) {

        EnumMap<Roles,String> em=new EnumMap<>(Roles.class);
        em.put(Roles.ADMIN,"User 1");
        em.put(Roles.MANAGER,"User 1");
        em.put(Roles.SUPER_ADMIN,"User 1");


        System.out.println(em);


    }
}

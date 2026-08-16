package miniProject1;

import java.util.ArrayList;

public class Repository {
    static ArrayList<Users> list=new ArrayList<>();

    public static void addUser(int id,String name,String password){
        list.add(new Users(id,name,password));
        System.out.println("ID - "+id +" name - "+name+" password - "+ password);

    }

    public static String loginUser(String name, String password){

        String username=name;
        String userPassword =password;
        for (Users user: list){
            if (user.getName().equals(name)&&user.getPassword().equals(password)){
                System.out.println("user successfully login");
                return "user successfully login";
            }
        }
        System.out.println("user not found");
        return "user not found";
    }
}

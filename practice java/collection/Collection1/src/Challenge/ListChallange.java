package Challenge;

import java.util.*;

class User{
     int id;
     String name;
    int salary;

    public User(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.salary = price;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + salary +
                '}'+"\n";
    }
}

class UserList{
    LinkedList<User> list = new LinkedList<User>();
    ArrayList<User> arr=new ArrayList<>(list);

    Scanner scan =new Scanner(System.in);
    public void add(){

        System.out.println("enter the user id ");
        int userId = scan.nextInt();
        scan.nextLine();
        System.out.println("enter the user name");
        String username=scan.nextLine();
        System.out.println("enter the salary");
        int salary=scan.nextInt();


        list.add(new User(userId,username,salary));
    }

    public void get(){
//        ArrayList<User> arr=new ArrayList<>();
        arr.addAll(list);
//        int serachId=14;
        System.out.println("which id do you want get ");
        int serachId=scan.nextInt();

        ////for(int i=0; i<arr.size();i++){
        ////User user=arr.get(i);
        ///if (user.id==search){
        //// System.out.println("Found the user -"+ user);
        ////}
        for(User user :arr){
            if(user.id==serachId){
                System.out.println("Found the user -"+ user);
            } else  {
                System.out.println("user not found ");
            }
        }
    }

    public void remove(){
        System.out.println("Enter which ID do you want remove ");
        int removeId=scan.nextInt();
        for(User user : list){
            if(user.id==removeId){
                System.out.println("Remove user - "+ list.remove(user));
            }
        }
    }

    public void set(){
        System.out.println("enter index value ");
        int index=scan.nextInt();
        System.out.println("enter the user id ");
        int userId = scan.nextInt();
        scan.nextLine();
        System.out.println("enter the user name");
        String username=scan.nextLine();
        System.out.println("enter the salary");
        int salary=scan.nextInt();
        list.set(index,new User(userId,username,salary));

    }

    public void mintoMax(){
        Comparator <User> custam=new Comparator<User>() {
            @Override
            public  int compare(User x ,User  y){
                if(x.id<y.id){
                    return -1;
                } else if (x.id>y.id) {
                    return 1;
                }
                return 0;
            }
        };

        PriorityQueue<User> que =new PriorityQueue<User>(custam);
        que.addAll(arr);
        System.out.println(que);
        while (!que.isEmpty()){
            System.out.println(que.poll());
        }
    }


}
class Controller{

    public  void control(){
        UserList userList=new UserList();

        while (true){
            Scanner scan=new Scanner(System.in);
            System.out.println("which operation do you want");
            System.out.println("if you want to add user 1, get the user press 2 , remove the user press 3 ,update the user press 4 , if you want see the user ascending order press 5  ");
            String opr=scan.nextLine();
            switch (opr){
                case "1":
                    userList.add();
                    break;
                case "2":
                    userList.get();
                    break;
                case "3":
                    userList.remove();
                    break;
                case "4":
                    userList.set();
                    break;
                case "5":
                    userList.mintoMax();
                    break;
                default:
                    System.out.println("invalid ");
                    break;

            }
            System.out.println("if you continue pres 1 or 0");
            int op=scan.nextInt();
            if(op==0){
                break;
            }

        }

    }

}
public class ListChallange {
    public static void main(String[] args) {

        Controller controller=new Controller();

        controller.control();



//        UserList userList=new UserList();
//
//        while (true){
//            Scanner scan=new Scanner(System.in);
//            System.out.println("which operation do you want");
//            String opr=scan.nextLine();
//            switch (opr){
//                case "add":
//                    userList.add();
//                    break;
//                case "get":
//                    userList.get();
//                    break;
//                case "remove":
//                    userList.remove();
//                    break;
//                case "set":
//                    userList.set();
//                    break;
//                default:
//                    System.out.println("invalid ");
//                    break;
//
//            }
//            System.out.println("if you continue pres 1 or 0");
//            int op=scan.nextInt();
//            if(op==0){
//                break;
//            }
//
//        }

         ////add the value
//        LinkedList<User> list = new LinkedList<User>();
//
//        list.add(new User(12, "Shahin", 2000));
//        list.add(new User(13, "mahin", 4000));
//        list.add(new User(14, "raja", 1000));
//        list.add(new User(15, "visal", 500));
//        System.out.println("List item - "+ list);


////for(int i=0; i<arr.size();i++){
        ////User user=arr.get(i);
        ///if (user.id==search){
        //// System.out.println("Found the user -"+ user);
        ////}
//        ArrayList<User> arr = new ArrayList<User>();
//        System.out.println("Original value"+arr);
//        arr.addAll(list);
//        int serachId=14;
//        for(User user :arr){
//            if(user.id==serachId){
//                System.out.println("Found the user -"+ user);
//            }
//        }

//        int removeId=15;
//        for(User user : list){
//            if(user.id==removeId){
//                System.out.println("Remove user - "+ list.remove(user));
//            }
//        }
//
//       list.set(2,new User(16,"raja",3566));
//
//
//        System.out.println("List item - "+ list);
    }
}

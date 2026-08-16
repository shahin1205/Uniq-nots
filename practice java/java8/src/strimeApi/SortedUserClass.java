package strimeApi;


import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class  User{
    int id;
    String name;
    double price;

    User(int id,String name,double price){
        this.id=id;
        this.name=name;
        this.price=price;
    }

    @Override
    public String toString() {
        return "Rec{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}

public class SortedUserClass {
    public static void main(String[] args) {
        ArrayList<User> arr=new ArrayList<>(List.of(
                new User(13,"C",1234),
                new User(12,"A",456),
                new User(14,"B",5678)
        ));
//        Comparator<User> compare=new Comparator<User>() {
//            @Override
//            public int compare(User o1, User o2) {
//                return o1.id-o2.id;
//            }
//        };
//        Comparator<User> compare1=new Comparator<User>() {
//            @Override
//            public int compare(User o1, User o2) {
//                return o1.name.compareTo(o2.name);
//            }
//        };
//        arr.stream()
//                .sorted(compare)
//                .forEach(System.out::println);
//
//        arr.stream()
//                .sorted(compare1)
//                .forEach(System.out::println);
        ////-----------------------------------------------------------------------------
        arr.stream()
//                .sorted((a,b)->Double.compare(b.price,a.price))
////                .sorted(Comparator.comparing(r -> r.price))
                .sorted(Comparator.comparing((User r)->r.price).reversed())
                .forEach(System.out::println);
    }
}
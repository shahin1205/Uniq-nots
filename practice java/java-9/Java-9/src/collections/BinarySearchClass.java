package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class User1{
    int id;
    String name;

    public User1(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
public class BinarySearchClass {
    public static void main(String[] args) {
//        ArrayList<Integer> arr=new ArrayList<>(
//                List.of(12,3,56,76,3,7,8,5)
//        );
//        Collections.sort(arr);
//        int index=Collections.binarySearch(arr,12);
//        System.out.println(index);

        ArrayList<User1> user1=new ArrayList<>(
                List.of(new User1(1,"Shahin"),new User1(2,"Mahin"),new User1(3,"babu"))
        );

        Comparator<User1> idBased=new Comparator<User1>() {
            @Override
            public int compare(User1 o1, User1 o2) {
                if (o1.id<o2.id){
                    return -1;
                } else if (o1.id>o2.id) {
                    return 1;
                }
                return 0;
            }
        };
        Collections.sort(user1,idBased);
        int index =Collections.binarySearch(user1,new User1(1,"Shahin"),idBased);
        System.out.println(index);

    }
}

package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class  User{
    int id;
    String name;

    User(int id , String name ){
        this.id=id;
        this.name=name;
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
public class MaxMin {
    public static void main(String[] args) {
//        ArrayList<Integer> list=new ArrayList<>(List.of(2,5,7,5,4,6));
//        int max= Collections.max(list);
//        int min=Collections.min(list);
//        System.out.println("Max value - "+max);
//        System.out.println("Min value - "+min);

        ArrayList<User> list=new ArrayList<>(
                List.of(new User(12,"Shain"),
                        new User(13,"Mahin"),
                        new User(14,"Babu"))
        );

        Comparator<User> idBased=new Comparator<User>() {
            @Override
            public int compare(User o1,User o2){
                if(o1.id<o2.id){
                    return -1;
                }
                else if(o1.id>o2.id){
                    return 1;
                }
                return 0;
            }
        };

        User max=Collections.max(list,idBased);
        User min=Collections.min(list,idBased);
        System.out.println(max);
        System.out.println(min);

    }
}

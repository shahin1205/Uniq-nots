package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Person{
    int id;
    String name;

    Person(int id,String name){
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
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
public class SortClass {
    public static void main(String[] args) {
//        ArrayList<Integer> sort=new ArrayList<>(
//                List.of(12,3,56,76,3,7,8,5)
//        );
//        Collections.sort(sort);
//        System.out.println(sort);

        ArrayList<Person> user=new ArrayList<>(
                List.of(new Person(13,"Shahin"),(new Person(11,"Mahin")),
                        (new Person(5,"babu")))
        );

        Comparator<Person> idBased=new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                if(o1.id< o2.id){
                    return -1;
                }
                else if(o1.id>o2.id){
                    return 1;
                }
                return 0;
            }
        };
        Collections.sort(user,idBased);
        System.out.println(user);
    }
}

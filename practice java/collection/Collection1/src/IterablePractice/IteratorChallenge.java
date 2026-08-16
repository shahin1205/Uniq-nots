package IterablePractice;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Person{
    int id;
    String name;
    double price;
    boolean stackAvailability;

    public Person(int id, String name, double price, boolean stackAvailability) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.stackAvailability = stackAvailability;
    }

    @Override
    public String toString() {
        return "\n{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", stackAvailability=" + stackAvailability +
                '}';
    }
}

class Service{
    ArrayList<Person> arr=new ArrayList<>();
    void add(){
        arr.add(new Person(12,"Laptop",75000,true));
        arr.add(new Person(13,"Mobile",35000,true));
        arr.add(new Person(14,"headphone",1500,true));
        arr.add(new Person(15,"speaker",5000,true));
        arr.add(new Person(16,"iphone",80000,true));
        arr.add(new Person(17,"iphone",80000,true));

    }



    void iterating(){
        add();
        Iterator<Person> at=arr.iterator();
        Scanner sc=new Scanner(System.in);
        System.out.println("Want a product within this price rage");
        int item=sc.nextInt();
        while (at.hasNext()){
           Person num= at.next();
           if (num.price>item || num.stackAvailability==false){
               at.remove();
           }
        }
        System.out.println(arr);
    }

}

public class IteratorChallenge {
    public static void main(String[] args) {
        Service service=new Service();
        service.iterating();
    }
}

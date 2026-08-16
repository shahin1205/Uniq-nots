package SetInterface;

import java.util.HashSet;
import java.util.TreeSet;

class Person implements Comparable<Person>{

    int id;
    String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int compareTo(Person other){
        return this.id- other.id;
    }
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class HasSetComparable {
    public static void main(String[] args){

        TreeSet<Person> has=new TreeSet();
        has.add(new Person(12,"c"));
        has.add(new Person(10,"D"));
        has.add(new Person(1,"a"));
        has.add(new Person(6,"h"));
        has.add(new Person(8,"f"));

        System.out.println(has);















    }
}

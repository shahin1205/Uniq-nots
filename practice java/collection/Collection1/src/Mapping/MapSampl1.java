package Mapping;

import java.util.HashMap;
import java.util.Objects;

class Person{
    int id;
    String name;
    int age;
    @Override
    public int hashCode() {
        return Objects.hash(id, name, age);
    }
    @Override
    public boolean equals(Object obj) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Person person = (Person) o;
        boolean isPossible=(obj instanceof Person)? true : false;
        if(isPossible)
        {
            Person person = (Person) obj;

            return this.id == person.id && this.name.equals(person.name) && this.age == person.age;

        }
        return isPossible;
    }



    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

public class MapSampl1 {
    public static void main(String[] args) {
        System.out.println(new Person(101,"shahin",23).hashCode());
        System.out.println(new Person(101,"shahin",24).hashCode());


        HashMap <Person,String> map=new HashMap<>();
        map.put(new Person(101,"shahin",23),"List 1");
        map.put(new Person(102,"shahin",24),"List 2");
        System.out.println(map);

    }
}

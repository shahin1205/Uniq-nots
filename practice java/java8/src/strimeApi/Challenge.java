package strimeApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

class Employees{
    int id;
    String name;
    double salary;

    public Employees(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
public class Challenge {
    public static void main(String[] args) {
        ArrayList<Employees> employees=new ArrayList<>(List.of(
                new Employees(12,null,3000),
                new Employees(13,null,4000),
                new Employees(14,null,5000)
        ));

        Employees salary= employees.stream()
                .min(Comparator.comparing(Employees::getName))
                .orElseThrow();
        System.out.println(salary);


//        employees.stream()
//                .map(x->x.salary)
//                .sorted()
//                .forEach(System.out::println);

//        employees.stream()
//                .map((x)->x.name)
//                .forEach(System.out::println);
//
//        employees.stream()
//
//                .filter((y)->y.salary>4000)
//                .forEach(System.out::println);
    }
}

package StreamCollector;

import java.util.*;
import java.util.stream.Collectors;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employees employees = (Employees) o;
        return id == employees.id && Double.compare(salary, employees.salary) == 0 && Objects.equals(name, employees.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary);
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


public class CollectorChallenge {

    public static void main(String[] args) {

        ArrayList<Employees> employees=new ArrayList<>(List.of(
                new Employees(12,"Shahin",2345),
                new Employees(13,"mahin",2345),
                new Employees(14,"mohammed",2345),
                new Employees(12,"Shahin",2345)
        ));


//        employees.stream()
//                .collect(Collectors.summarizingDouble((a)->a.salary));

//        employees.stream()
//                .collect(Collectors.minBy((a,b)->Double.compare(a.salary,b.salary)))
//                .map(x->x.name+" Salary - "+ x.salary)
//                .ifPresent(System.out::println);

        employees.stream()
                .collect(Collectors.toSet())
                .forEach(System.out::println);

//        employees.stream()
//                .collect(Collectors.toCollection(HashSet::new))
//                .forEach(System.out::println);

    }
}

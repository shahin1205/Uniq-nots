package strimeApiTask;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;

class Employees{
    int id;
    String name;
    double salary;

    public Employees(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
//    @Override
//    public int hashCode() {
//        return Objects.hash(id);
//    }
    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary);
    }
    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Employees){
            Employees employees=(Employees) obj;
            return this.hashCode()==employees.hashCode();
        }
        else{
            return false;
        }
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
public class Task2 {
    public static void main(String[] args) {
        ArrayList<Employees> employees=new ArrayList<>(List.of(
                new Employees(13,"Babu",3000),
                new Employees(11,"Arun",4000),
                new Employees(12,"Durai",5000),
                new Employees(13,"Babu",3000)
        ));
        Comparator<Employees> compareID=new Comparator<Employees>() {
            @Override
            public int compare(Employees o1, Employees o2) {
                return o1.id-o2.id;
            }
        };
        Comparator<Employees> compareName=new Comparator<Employees>() {
            @Override
            public int compare(Employees o1, Employees o2) {
                return o1.name.compareTo(o2.name);
            }
        };

        employees.stream()
                .sorted(compareID)
                .distinct()
                .forEach(System.out::println);

    }
}

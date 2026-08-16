package strimeApi;


import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Employee{
    int id;
    String name;
    double salary;
    ArrayList<String> skill;

    public Employee(int id, String name, double salary, ArrayList<String> skill) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.skill = skill;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(skill, employee.skill);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(skill);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", skill=" + skill +
                '}';
    }
}
public class UserArrayClass {
    public static void main(String[] args) {
        ArrayList<Employee> users=new ArrayList<>();
        users.add(new Employee(12,"shahin",4342,new ArrayList<>(List.of("java","python"))));
        users.add(new Employee(13,"mahin",4742,new ArrayList<>(List.of("AWS","python"))));
        users.add(new Employee(12,"raja",4362,new ArrayList<>(List.of("java","python","javaScript"))));

        users.stream()
                .map(x->x.name+" <- Skills -> "+ String.join(", ",x.skill))
                .distinct()
//                .map(x->x.name+" <- Skills -> "+x.skill)
                .forEach(System.out::println);
        users.stream()
//                .map(x->x.name+" "+ String.join(", ",x.skill))
//                .map(x->x.name+" "+ x.skill)
                .flatMap(y->y.skill.stream())
                .distinct()
                .forEach(System.out::println);
    }
}

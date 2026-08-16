package StreamCollector.groping;


import java.util.*;
import java.util.stream.Collectors;

class Employee{
    int id;
    String name;
    String department;
    ArrayList<String> skils;

    public Employee(int id, String name, String department, ArrayList<String> skils) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.skils = skils;
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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public ArrayList<String> getSkils() {
        return skils;
    }

    public void setSkils(ArrayList<String> skils) {
        this.skils = skils;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", skils=" + skils +
                '}';
    }
}
public class FlatMappingPractice {
    public static void main(String[] args) {
        ArrayList<Employee> employee=new ArrayList<>(List.of(
                new Employee(12,"user 1","java",new ArrayList<>(List.of("java","python"))),
                new Employee(13,"user 2","python",new ArrayList<>(List.of("java","python"))),
                new Employee(14,"user 3","java",new ArrayList<>(List.of("java","python"))),
                new Employee(15,"user 4","python",new ArrayList<>(List.of("java","python"))),
                new Employee(16,"user 5","java",new ArrayList<>(List.of("java","python"))),
                new Employee(17,"user 6","python",new ArrayList<>(List.of("java","python")))
        ));

        Set<String> map7 = employee.stream()
                .collect(Collectors.flatMapping(
                        emp -> emp.getSkils().stream(),
                        Collectors.toSet()
                ));
        System.out.println(map7);

        ////out put : [python, java]

        /////------------------------------------------------------------------------------
    }
}

package challenge;
import java.time.LocalDate;
import java.util.*;

class Employee {

    private int id;
    private String name;
    private double salary;
    private LocalDate joiningDate;
    private LocalDate relievingDate;

    public Employee(int id, String name, double salary, LocalDate joiningDate, LocalDate relievingDate) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.joiningDate = joiningDate;
        this.relievingDate = relievingDate;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public LocalDate getRelievingDate() {
        return relievingDate;
    }

    @Override
    public String toString() {
        return id + " | " + name + " | " + salary + " | " + joiningDate + " | " + relievingDate;
    }
}
public class NewChalleng {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();

        employees.add(new Employee(1, "Arun", 45000, LocalDate.of(2020, 1, 10), null));
        employees.add(new Employee(2, "Bala", 60000, LocalDate.of(2019, 3, 15), null));
        employees.add(new Employee(3, "Charan", 55000, LocalDate.of(2018, 7, 20), LocalDate.of(2022, 5, 30)));
        employees.add(new Employee(4, "Divya", 70000, LocalDate.of(2021, 6, 1), null));
        employees.add(new Employee(5, "Esha", 50000, LocalDate.of(2020, 11, 25), LocalDate.of(2023, 1, 10)));
        employees.add(new Employee(6, "Farhan", 80000, LocalDate.of(2017, 9, 10), null));
        employees.add(new Employee(7, "Gokul", 30000, LocalDate.of(2022, 2, 5), null));
        employees.add(new Employee(8, "Hari", 65000, LocalDate.of(2016, 4, 18), LocalDate.of(2021, 12, 31)));
        employees.add(new Employee(9, "Isha", 72000, LocalDate.of(2019, 8, 8), null));
        employees.add(new Employee(10, "John", 40000, LocalDate.of(2023, 1, 1), null));

        ////----------------------------------------------------------------------
        Optional<String> count=employees.stream()
                .map(x->x.getName())
                .reduce((x,y)->x+", "+y);
        System.out.println(count.get());

        ////-----------------------------------------------------------------------
        Optional<Double> sumvalue= employees.stream()
                .map(x->x.getSalary())
                 .reduce((x,y)->x+y);
        Double sum=sumvalue.get();
        System.out.println("Total employee salary "+sum);


////--------------------------------------------------------------------------


//         employees.stream()
//
//                .sorted(Comparator.comparing((Employee e)->e.getJoiningDate()).reversed())
//                .limit(3)
//                .forEach(s-> System.out.println(s.getName()+"->" +s.getJoiningDate()));

        /////-------------------------------------------------------------
//        employees.stream()
//                .sorted(Comparator.comparing((Employee e) ->e.getSalary()).reversed())
//                .limit(3)
//                .forEach((x)-> System.out.println(x.getName()+" -> "+x.getSalary()));

        ////---------------------------------------------------------------------------------
//        Comparator<Employee> compare=new Comparator<Employee>() {
//            @Override
//            public int compare(Employee o1, Employee o2) {
//                return Double.compare(o2.getSalary(), o1.getSalary());
//            }
//        };
//        employees.stream()
////                .filter((x)->x.getSalary()>=5000)
//                .sorted(Comparator.comparing(e->e.getSalary()))
//                .map((x)->x.getSalary())
//                .forEach(x-> System.out.println(x));
    }
}
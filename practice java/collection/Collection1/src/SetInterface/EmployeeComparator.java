package SetInterface;

import java.util.*;

class Employee{
    int id;
    String name;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }


    @Override
    public String toString() {
        return "\n{" +
                "id= " + id +
                ", name= " + name  +
                '}';
    }
}

class Service{
    ArrayList<Employee> list=new ArrayList<>();

    void  add() {
        list.add(new Employee(3, "Babu"));
        list.add(new Employee(1, "Ali"));
        list.add(new Employee(2, "Durai"));
        list.add(new Employee(5, "Elago"));
        list.add(new Employee(4, "Fayas"));

    }
    Comparator<Employee> ascendingOrder=new Comparator<>() {
        @Override
        public int compare(Employee e1,Employee e2) {
            return e1.name.compareTo(e2.name) ;
        }
    };
    Comparator<Employee> descendingOrder=new Comparator<>() {
        @Override
        public int compare(Employee e1,Employee e2) {
            return e2.name.compareTo(e1.name);
        }
    };
    public void showAscending() {
        TreeSet<Employee> tree = new TreeSet<>(ascendingOrder);
        tree.addAll(list); //

        System.out.println("Ascending Order:");
        System.out.println(tree);
    }

    public void showDescending() {
        TreeSet<Employee> tree = new TreeSet<>(descendingOrder);
        tree.addAll(list); //

        System.out.println("Descending Order:");
        System.out.println(tree);
    }

}

class Connector{

    Service service=new Service();
    Scanner sc=new Scanner(System.in);
    void user(){
        service.add();
        while (true){
            System.out.println("Enter 1 ascending order and 2 descending order press 3 exit ");
            int num=sc.nextInt();
            switch (num){
                case 1:
                    service.showAscending();
                    break;
                case 2:
                    service.showDescending();
                    break;
                case 3:
                    System.out.println("Thank you");
                    return;
                default:
                    System.out.println("Enter the correct number");
            }

        }
    }


}
public class EmployeeComparator {
    public static void main(String[] args) {

        Connector connector=new Connector();
        connector.user();


    }
}

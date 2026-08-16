package QueueSample;

import java.util.PriorityQueue;

class Employee implements Comparable<Employee> {

  private String name;
    private int id ;
    private double salary;
    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }


    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
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
    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                '}'+"\n";
    }

    public int compareTo(Employee o){
        if(this.salary<o.salary){
            return -1;
        } else if (this.salary>o.salary) {
            return 1;
        }
        return 0;

    }

}
public class CoparablePractice {
    public static void main(String[] args) {


        PriorityQueue<Employee> q=new PriorityQueue<>();

        q.offer(new Employee("Shain",20,50000));
        q.offer(new Employee("mahin",13,45500));
        q.offer(new Employee("aravindh",16,15000));
        q.offer(new Employee("vishal",19,20000));
        q.offer(new Employee("raja",17,10000));
        q.offer(new Employee("kamal",15,13500));
        System.out.println(q);
//        System.out.println(q.poll()+"\n"+q.poll()+"\n"+q.poll()+"\n"+q.poll()+"\n"+q.poll()+"\n"+q.poll()+"\n");
    }
}

package dateAndTime;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

class Employee{
    int id;
    String name;
    LocalDate joiningDate;
    LocalDate reliving;

    public Employee(int id, String name, LocalDate joiningDate, LocalDate reliving) {
        this.id = id;
        this.name = name;
        this.joiningDate = joiningDate;
        this.reliving = reliving;
    }

    @Override
    public String toString() {
        return "\n" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", joiningDate= " + joiningDate +
                ", reliving= " + reliving ;
    }
}

public class Challenge2 {
    public static void main(String[] args) {

        ArrayList<Employee> list=new ArrayList<>();
        list.add(new Employee(12,"shahin",LocalDate.of(2023,12,5),LocalDate.now()));
        list.add(new Employee(13,"mahin",LocalDate.of(2022,11,6),LocalDate.now()));
        list.add(new Employee(12,"mohammed",LocalDate.of(2025,12,5),LocalDate.now()));

//        System.out.println(list);
        Employee junior=null;
        Employee senior=null;
        long min=0;
        long max=Long.MAX_VALUE;
        for (Employee employee:list){

            long days= ChronoUnit.DAYS.between(employee.joiningDate,employee.reliving);

            System.out.println(employee.name+"-> "+days+" worked");
            if (days>min){
                min=days;
                junior=employee;
            }
            if (days<max){
                max=days;
                senior=employee;
            }
        }
        System.out.println();
        System.out.println("Senior - "+junior.name+" "+min+" Days worked");
        System.out.println("Junior- "+ senior.name+" "+max+" Days worked");
        }
    }


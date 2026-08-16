package PracticePackage;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

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

public class Main {
    public static void main(String[] args) {
        List<String> names=new ArrayList<>(List.of("shahin","mahin","Gokul"));

        List<String> update=names.stream()
                .map(name -> name.equals("shahin") ? "mahin" : name)
                .collect(Collectors.toList());
        System.out.println(update);

    }
}

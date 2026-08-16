package StreamCollector.groping;

import java.util.*;
import java.util.stream.Collectors;

class Employees{
    int id;
    String name;
    String department;
    int age;

    public Employees(int id, String name, String department, int age) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.age = age;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employees{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", age=" + age +
                '}';
    }
}
public class GropingPractice {
    public static void main(String[] args) {
        ArrayList<Employees> employees=new ArrayList<>(List.of(
                new Employees(12,"user 1","java",13),
                new Employees(13,"user 2","python",33),
                new Employees(14,"user 3","java",23),
                new Employees(15,"user 4","python",25),
                new Employees(16,"user 5","java",23),
                new Employees(17,"user 6","python",22),
                new Employees(17,"user 6","python",22)
        ));
        ////--------------------------------------------------------------------------
//        Map<String,List<Employees>> map=employees.stream()
//                .collect(Collectors.groupingBy((emp)->emp.getDepartment()));
//        System.out.println(map);

        ////--------------------------------------------------------------------------

//        Map<String,Long> map2=employees.stream()
//                .collect(Collectors.groupingBy((emp)->emp.getDepartment(), Collectors.counting()));
//        System.out.println(map2);

//////         out put: {python=4, java=3}

        ////--------------------------------------------------------------------------

//       Map<String,List<String>> map1=employees.stream()
//                .collect(Collectors.groupingBy((emp)->emp.getDepartment(),
//                Collectors.mapping((emp)->emp.getName(),
//                Collectors.toList())));
//        System.out.println(map1);

//////      out put: {python=[user 2, user 4, user 6, user 6], java=[user 1, user 3, user 5]}

        ////--------------------------------------------------------------------------

//        Map<Boolean, String> map4 = employees.stream()
//                .collect(Collectors.partitioningBy(
//                        emp -> emp.getAge() >= 30,
//                        Collectors.mapping(emp -> emp.getName(),
//                                Collectors.joining(",", "{", "}"))
//                ));
//        System.out.println(map4);

        /////out put : {false={user 1,user 3,user 4,user 5,user 6,user 6}, true={user 2}}

        ////--------------------------------------------------------------------------

//        Map<String,String> map5=employees.stream()
//                .collect(Collectors.toMap(emp->emp.getName(),
//                        (emp)->emp.getDepartment(),
//                        (oldValue,newValue)->oldValue+", "+newValue));
//        System.out.println(map5);

////Out put: {user 4=python, user 3=java, user 2=python, user 1=java, user 6=python, python, user 5=java}
                                                                        ////------------------
        ////--------------------------------------------------------------------------

//        TreeMap<String,String> map6=employees.stream()
//                .collect(Collectors.toMap(emp->emp.getName(),
//                        (emp)->emp.getDepartment(),
//                        (oldValue,newValue)->oldValue+", "+newValue,
//                        ()->new TreeMap<>()));
//        System.out.println(map6);

/////out put:  {user 1=java, user 2=python, user 3=java, user 4=python, user 5=java, user 6=python, python}
                                                                                    ////------------------
////-------------------------------------------------------------------------------------------

//        List<Employees> map7=employees.stream()
//                .collect(Collectors.filtering(emp->emp.getAge()>=30,Collectors.toList()));
//        System.out.println(map7);

        ////Out put: [Employees{id=13, name='user 2', department='python', age=33}]
        ////------------------------------------------------------------------------------------

    }
}

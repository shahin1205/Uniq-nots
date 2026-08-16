package strimeApi;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Users{
    int id;
    String name;
    double salary;

    public Users(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary);
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof Users){
            Users users=(Users) obj;
            return this.hashCode()==users.hashCode();
        }
        else {
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
public class RemoveUserDuplicate {
    public static void main(String[] args) {
        ArrayList<Users> users=new ArrayList<>(List.of(
                new Users(12,"shahin",3000),
                new Users(13,"mahin",4000),
                new Users(14,"Mohammed",5000),
                new Users(12,"shahin",3000)
        ));
        users.stream()
                .distinct()
                .forEach(System.out::println);
    }
}

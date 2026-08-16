package jsontoobjecct;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.ArrayList;
import java.util.List;

public class Controller {

public void jsonToObject(){
        try {

            String json ="["
                    + "{\"id\":1,\"name\":\"Shahin\",\"salary\":1000},"
                    + "{\"id\":2,\"name\":\"Arun\",\"salary\":2000}"
                    + "]";

            ObjectMapper mapper = new ObjectMapper();

            List<Employees> employees = mapper.readValue(
                    json,
                    new TypeReference<List<Employees>>() {}
            );

            for (Employees emp : employees) {
                System.out.println("Id : " + emp.getId());
                System.out.println("Name : " + emp.getName());
                System.out.println("Price : " + emp.getSalary());
                System.out.println("----------------");
            }
        }catch (Exception e){
        e.printStackTrace();
    }
}


public void objectToJson() throws JsonProcessingException {
    List<Employees> employees=new ArrayList<Employees>() ;

    ObjectMapper mapper=new ObjectMapper();

    employees.add(new Employees(1,"shahin",234));
    employees.add(new Employees(2,"mahin",658));
    employees.add(new Employees(3,"shahin",987));

   String json= mapper.writeValueAsString(employees);
    System.out.println(json);

}
}

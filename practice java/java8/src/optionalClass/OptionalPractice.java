package optionalClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalPractice {
    public static List<String> names= new ArrayList<>(List.of("A","B","c","D"));

    public static String findOut(String inPut){

        String result=null;
        for (String name:names){
            if (inPut.equals(name)){
                result=name;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        String inPut=findOut("m");
//        System.out.println(inPut);
//        System.out.println(inPut.toUpperCase());

        Optional<String> optional=Optional.ofNullable(inPut);
        System.out.println(optional);

        System.out.println(optional.orElse("No data found"));

    }
}

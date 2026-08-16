package optionalClass;

import java.util.Optional;

public class OptionalMethods {
    public static void main(String[] args) {
//        Optional<String> optional=Optional.ofNullable(null);

        Optional<String> optional=Optional.ofNullable("Sample");

        ////isPresent()
//        System.out.println(optional.isPresent());

        ////isEmpty()
//        System.out.println(optional.isEmpty());

////          ifPresent
//        optional.ifPresent((s)-> System.out.println(s.toUpperCase()));

////        orElse()
//        String name=optional.orElse("A");
//        System.out.println(name);

        ////orElseGet()
        String name=optional.orElseGet(()->"A");
        System.out.println(name);

//        ////orElseThrow()
//        String name=null;
//        try {
//            name=optional.orElseThrow(()->{throw new RuntimeException("No data found");});
//        }
//        catch (RuntimeException e){
//            System.out.println(e.getMessage());
//        }

        ////Map()
//        Optional<Integer> obj=optional
//                .map((s)->s.length());
//        System.out.println(obj.get());

        ////filter
//        String name=optional.filter((s)->s.length()==6)
//                .get();
//        System.out.println(name);
    }
}

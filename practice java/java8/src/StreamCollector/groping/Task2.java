package StreamCollector.groping;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task2 {
    public static void main(String[] args) {
        Map<Character,Long> s=Stream.of("Hello world")
                .flatMap(x->x.chars().mapToObj(c->(char)c))
               .collect(Collectors.groupingBy(
                       c->c,
                       Collectors.counting()
               ));

        System.out.println(s);



    }
}

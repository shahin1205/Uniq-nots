package methodReference;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamMethodReferance {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>(List.of("hello","world","one","two"));

        list.stream()
                .map(s->s + "->" +s.length())
                .forEach(System.out::println);
    }
}

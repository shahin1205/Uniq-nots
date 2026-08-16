package strimeApi;

import java.util.function.Predicate;
import java.util.stream.IntStream;

public class StringToStream {
    public static void main(String[] args) {
        String s="hello world";

        Predicate<Character> condition= (Character x)->(x=='A'||x=='E'||x=='I'||x=='O'||x=='U')||(x=='a'||x=='e'||x=='i'||x=='o'||x=='u');
        s.chars()
                .mapToObj((y)->(char)y)
                .filter(condition)
                .forEach((x)-> System.out.println(x));



        ////Intstream
        s.chars()
        .mapToObj((y)->(char)y)
        .forEach((x)-> System.out.println(x));


    }
}

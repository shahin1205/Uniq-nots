package strimeApiTask;

import javax.xml.namespace.QName;
import java.awt.image.ImageProducer;
import java.util.Arrays;
import java.util.function.Predicate;

public class Task3 {
    public static void main(String[] args) {

        String number="one two three four";
        Predicate<Character> condition= (Character x)->(x=='A'||x=='E'||x=='I'||x=='O'||x=='U')||(x=='a'||x=='e'||x=='i'||x=='o'||x=='u');
////           only print vowel later
        Arrays.stream(number.split(" "))
                .map(x -> x.chars()
                        .mapToObj(c -> (char) c)
                        .filter(condition)
                        .toList())
                .forEach(System.out::println);

/////        print only length
        Arrays.stream(number.split(" "))
                .map(x->x.length())
                .forEach(System.out::println);


    }
}

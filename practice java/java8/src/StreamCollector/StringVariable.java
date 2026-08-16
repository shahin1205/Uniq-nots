package StreamCollector;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collector;

public class StringVariable {
    public static void main(String[] args) {


    String s="one two three four five";

    Collector<String, StringBuilder, String> collector = Collector
            .of(()-> new StringBuilder(),
                    (sb, s1) -> sb.append(s1).append(","),
                    (sb1, sb2)-> {sb1.append(sb2); return sb1;},
                    (sb)-> {String res =sb.toString();
                        return res.substring(0, res.length()-1);
                    });

    String s2 = Arrays.stream(s.split(" "))
            .collect(collector);

        System.out.println(s2);
    }
}

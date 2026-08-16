package comparableAndComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CompareString {
    public static void main(String[] args) {
        List<String> list=new ArrayList<String>(
                List.of("a","d","c")
        );

        ////anonymous class
        Comparator<String> com=new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.compareTo(s2)<0){
                    return -1;
                } else if (s1.compareTo(s2)>0) {
                    return 1;
                }
                return 0;
            }
        };
        Collections.sort(list,com);

        ////Lambda Expression
//        Collections.sort(list,(s1,s2)->s1.compareTo(s2));

        System.out.println(list);
    }
}

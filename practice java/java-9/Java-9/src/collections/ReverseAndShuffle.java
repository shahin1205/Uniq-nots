package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseAndShuffle {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(List.of(2,4,6,7,32,7));
        Collections.reverse(list);
        System.out.println(list);

        Collections.shuffle(list);
        System.out.println(list);

    }
}

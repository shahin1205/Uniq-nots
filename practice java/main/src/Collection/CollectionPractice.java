package Collection;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Map;
import java.util.TreeMap;

public class CollectionPractice {
    public static void main(String[] args) {
        ArrayList<String> arr=new ArrayList<>();
        arr.add("shahin");
        arr.add("mahinn");
        arr.add("ali");
        arr.add("mohammed");
        arr.add("raja");

        ListIterator<String> list=arr.listIterator();
        while (list.hasNext()){
            list.next();
        }
        while (list.hasPrevious()){
            String name =list.previous();
            System.out.println(name);


        }


    }
}

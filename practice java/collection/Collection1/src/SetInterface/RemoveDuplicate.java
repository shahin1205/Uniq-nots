package SetInterface;

import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicate {
    public static void main(String[] args) {
//        ArrayList<Integer> arr=new ArrayList<>();
//        arr.add(1);
//        arr.add(2);
//        arr.add(2);
//        arr.add(3);
//        arr.add(1);
//        HashSet<Integer> has=new HashSet<Integer>(arr);
//        System.out.println(has);
        int arr[]={1,2,2,3,1};

        HashSet<Integer> has=new HashSet<Integer>();
        for(Integer s:arr){
            has.add(s);
        }
        System.out.println(has);



    }
}

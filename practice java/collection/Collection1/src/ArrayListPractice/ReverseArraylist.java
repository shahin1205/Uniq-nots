package ArrayListPractice;

import java.util.ArrayList;

public class ReverseArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(23);
        arr.add(24);
        arr.add(25);
        arr.add(26);
        arr.add(27);
        for (int i=arr.size()-1;i>=0;i--){

            System.out.println(arr.get(i));
        }


    }
}

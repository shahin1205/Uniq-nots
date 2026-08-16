package ArrayListPractice;

import java.util.ArrayList;

public class RemoveDuplicate {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<Integer>();

        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);
        arr.add(0);
        arr.add(0);
        arr.add(4);
        arr.add(6);
        System.out.println("Original array " + arr);
        for (int i = 0; i < arr.size(); i++) {
            for (int j=i+1 ; j<arr.size();j++){
                if(arr.get(i).equals(arr.get(j))){
                    arr.remove(j);
                }
            }
//           System.out.println("remove duplicate "+ arr);

        }

        System.out.println("remove duplicate "+ arr);


        }
}

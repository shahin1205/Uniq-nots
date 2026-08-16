package SetInterface;

import java.util.ArrayList;
import java.util.HashSet;

public class PrintDuplicate {
    public static void main(String[] args) {

        HashSet<Integer> has=new HashSet<>();

        int [] arr={1,2,3,5,7};
        int [] arr1={6,7,1,2,8};
        for(int i=0;i<arr.length;i++){
            for (int j=0; j<arr1.length;j++){
                if(arr[i]==arr1[j]){
                    has.add(arr[i]);

                }
            }
        }
        System.out.println(has);


    }

}
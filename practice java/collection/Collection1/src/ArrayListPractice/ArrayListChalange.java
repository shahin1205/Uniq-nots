package ArrayListPractice;

import java.util.ArrayList;

public class ArrayListChalange {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<Integer>();
        arr.add(23);
        arr.add(26);
        arr.add(28);
        arr.add(12);
        arr.add(45);
        arr.add(78);

        Integer min =arr.get(0);
        Integer secMin=arr.get(0);

        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);

            if (num < min) {
                secMin = min;
                min = num;
            }
            else if (num < secMin && num != min) {
                secMin = num;
            }
        }

        System.out.println(min);
        System.out.println(secMin);


        System.out.println("Maximun value ");

        Integer max =arr.get(0);
        Integer secMax=arr.get(0);

        for (int i = 0; i < arr.size(); i++) {
            int num = arr.get(i);

            if (num > max) {
                secMax = max;
                max = num;
            }
            else if (num > secMax && num != max) {
                secMax = num;
            }
        }

        System.out.println(max);
        System.out.println(secMax);


    }
}

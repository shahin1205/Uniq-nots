package strimeApiTask;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        int[] arr={1,2,6,4,3,1,4};
        System.out.println("Integer sorted and ascending order ");
        Arrays.stream(arr)
                .distinct()
                .sorted()
                .forEach(x-> System.out.print(x+" , "));

        System.out.println();
        System.out.println("String sorted and ascending order");

        String[] arr1={"b","d","a","c","a"};
        Arrays.stream(arr1)
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }
}

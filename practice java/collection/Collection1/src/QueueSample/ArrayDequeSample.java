package QueueSample;

import java.util.ArrayDeque;

public class ArrayDequeSample {
    public static void main(String[] args) {
        ArrayDeque<Integer> arr=new ArrayDeque<>();
        arr.add(12);
        arr.add(56);
        arr.add(13);
        arr.add(15);
        arr.push(45);

        arr.addLast(0);
        arr.addFirst(9);
        System.out.println(arr);
        System.out.println(arr.pop());
    }
}

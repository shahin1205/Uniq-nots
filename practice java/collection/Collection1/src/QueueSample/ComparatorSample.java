package QueueSample;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

public class ComparatorSample {
    public static void main(String[] args) {

        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(2);
        arr.add(45);
        arr.add(32);
        Comparator <Integer> custam=new Comparator<Integer>() {
            @Override
            public  int compare(Integer x,Integer y){
                if(x<y){
                    return -1;
                } else if (x>y) {
                    return 1;
                }
                return 0;
            }
        };

        PriorityQueue<Integer> que =new PriorityQueue<Integer>(custam);
        que.addAll(arr);

        que.offer(14);
        que.offer(54);
        que.offer(23);
        que.offer(18);
        que.offer(9);

        System.out.println(que);

        while (!que.isEmpty()){
            System.out.println(que.poll());
        }
    }
}

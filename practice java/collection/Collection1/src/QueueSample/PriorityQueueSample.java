package QueueSample;

import java.util.PriorityQueue;

public class PriorityQueueSample {
    public static void main(String[] args) {
        PriorityQueue<Integer> q=new PriorityQueue<>();
        q.offer(12);
        q.offer(7);
        q.offer(9);
        q.offer(15);
        q.offer(29);


        System.out.println("Before useing poll - "+q);
        int x =q.poll();
        System.out.println("After using poll - "+x +"\n"+q);

        


    }
}

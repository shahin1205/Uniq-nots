package QueueSample;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Abcasting {
    public static void main(String[] args) {
//        Deque<Integer> deque=new LinkedList<>();
//        deque.offer(12);
//        deque.offer(13);
//        deque.offer(14);
//        deque.offer(19);
//        System.out.println(deque);

        Stack<String> stack=new Stack<>();
        String s=stack.push("hello world");
//        System.out.println(s);

        Stack<Character> ch=new Stack<>();
        for (int i=0;i<s.length();i++){
            ch.push(s.charAt(i));
        }
        while (!ch.isEmpty()){
            System.out.print(ch.pop());
        }
    }
}

package VectorPractice;

import java.util.Stack;

public class StackSample3 {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();

        stack.push(11);
        stack.push(12);
        stack.push(13);
        stack.push(14);
        stack.push(15);

        while (!stack.isEmpty()){

            Integer value=stack.pop();
            System.out.println(stack);

        }
    }
}

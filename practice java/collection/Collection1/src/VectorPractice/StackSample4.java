package VectorPractice;

import java.util.Stack;

public class StackSample4 {
    public static void main(String[] args) {
//Reverse String using stack
        Stack<String> stack = new Stack<String>();
        String s = stack.push("Hello world");

        Stack<Character> che = new Stack<>();

        // Push each character into stack
        for (int i = 0; i < s.length(); i++) {
            che.push(s.charAt(i));
        }

        // Pop characters and print in reverse order
        System.out.print("Reversed String: ");
        while (!che.isEmpty()) {
            System.out.print(che.pop());
        }
    }
}

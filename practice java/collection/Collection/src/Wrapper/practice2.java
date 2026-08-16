package Wrapper;

public class practice2 {
    public static void main(String[] args) {
        String s = "100";
        int x = Integer.parseInt(s);   // String → int
        Integer y = Integer.valueOf(s);
        System.out.println(y);
    }
}

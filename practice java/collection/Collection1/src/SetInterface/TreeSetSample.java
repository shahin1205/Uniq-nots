package SetInterface;

import java.util.TreeSet;

public class TreeSetSample {
    public static void main(String[] args) {
        TreeSet<Integer> tree=new TreeSet<>();
        tree.add(13);
        tree.add(1);
        tree.add(10);
        tree.add(8);
        tree.add(15);
        tree.add(3);
        System.out.println(tree);
    }
}

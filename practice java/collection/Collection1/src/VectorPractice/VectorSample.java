package VectorPractice;

import java.util.Vector;

public class VectorSample {
    public static void main(String[] args) {
        Vector<Integer> vector=new Vector<>();

        vector.addElement(12);
        vector.addElement(13);
        vector.addElement(14);
        vector.addElement(15);

        int x=vector.firstElement();
        int y =vector.lastElement();
        System.out.println("Vector fist element - "+x);
        System.out.println("Vector last element - "+y);

        vector.insertElementAt(13,0);
//        vector.removeAllElements();
//        vector.removeElement((Integer)13); ////give the object value
//        vector.removeElementAt(0);////give the index value
//        vector.setElementAt(14,0); //// update the value
        int s=vector.elementAt(3);
        int c=vector.capacity();
        System.out.println(s);
        System.out.println(c);

        System.out.println(vector);

    }
}

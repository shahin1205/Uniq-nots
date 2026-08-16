package SetInterface;

import java.util.HashSet;

public class HashSetSample {
    public static void main(String [] args){
        HashSet<String> has=new HashSet<>();
        has.add("Shahin");
        has.add("mahin");
        has.add("raja");
        has.add("vishal");
        has.add("null");
/*       Default capacity = 16
          reminder= hash % capacity
          3492774 ÷ 16 = 218298
          mul=218298 × 16=3492768
          index= 3492774 - 3492768 = 6

           threshold = capacity × loadFactor
          = 16 × 0.75
          = 12
 */
        for(String s:has) {
            System.out.println(s.hashCode()+" - "+ s);
        }
    }
}

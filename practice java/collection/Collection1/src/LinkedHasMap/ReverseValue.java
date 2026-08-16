package LinkedHasMap;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

public class ReverseValue {
    public static void main(String[] args) {
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
        map.put('a',3);
        map.put('b',2);
        map.put('c',1);
        map.put('d', 4);
        map.put('e', 5);

        /*
        for (int i=0;i<arr.size;i++){
        int s=arr.get(i)

        }
         */

//        for (Map.Entry<Character,Integer> entry:map.entrySet()){
//            for (Map.Entry<Character,Integer> entry1:map.entrySet()){
////                Integer num=entry.getValue();
////
////                Integer num2=entry1.getValue();
//                if(entry.getValue()>entry1.getValue()){
//                    int temp=entry.getValue();
////                    entry.getValue()=entry1.getValue();
////                    entry1.getValue()=temp;
//                    entry.setValue(entry1.getValue());
//                    entry1.setValue(temp);
//
//                }
//            }
//        }
//        for (Map.Entry<Character,Integer> entry:map.entrySet()) {
//
//            System.out.println(entry);
//        }


        Map.Entry<Character, Integer>[] arr = map.entrySet().toArray(new Map.Entry[0]);

        // Bubble sort based on value
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i+1; j < arr.length ; j++) {

                if (arr[i].getValue() > arr[j].getValue()) {

                    // swap entries (not just values)
                    Map.Entry<Character, Integer> temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (Map.Entry<Character, Integer> entry : arr) {
            System.out.println(entry);
        }


//        for (Map.Entry<Character,Integer> entry:map.entrySet()) {
//            System.out.println(entry.getKey()+" "+ entry.getValue());
//        }
//         value=map.values();

//        for (Integer ar: map.values()){
//            Integer num=map.get(ar);
//            int reverese =0;
//            while (ar!=0){
//                int digit =num%10;
//                reverese=reverese*10+digit;
//                num=num/10;
//
//            }
//            num=reverese;
//            System.out.println(map);
//
//        }
//
////        System.out.println(map.reversed()) ;

//        for (Map.Entry<Character,Integer> entry:map.entrySet()){
//// //           System.out.println(entry.getKey()+" "+entry.getValue());
//
//            int num= entry.getValue();
//            int reverse=0;
//            while (num!=0){
//                int digit =num%10;
//                reverse=reverse*10+digit;
//                num=num/10;
//
//            }
//            entry.setValue(reverse);
//            System.out.println(entry.getKey()+" "+entry.getValue());
//
//        }

    }
}

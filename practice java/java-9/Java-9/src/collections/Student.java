package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StuMark{
    String name ;
    int tamilMark;
    int englishMark;

    public StuMark(String name, int tamilMark, int englishMark) {
        this.name = name;
        this.tamilMark = tamilMark;
        this.englishMark = englishMark;
    }
    public int TotalMark(){
        return tamilMark+englishMark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTamilMark() {
        return tamilMark;
    }

    public void setTamilMark(int tamilMark) {
        this.tamilMark = tamilMark;
    }

    public int getEnglishMark() {
        return englishMark;
    }

    public void setEnglishMark(int englishMark) {
        this.englishMark = englishMark;
    }

    @Override
    public String toString() {
        return "\n" +
                "name='" + name + '\'' +
                ", tamilMark=" + tamilMark +
                ", englishMark=" + englishMark +
                 " Total=" + TotalMark();
    }
}

class Calculate{

    ArrayList<StuMark> list=new ArrayList<>(
            List.of(new StuMark("Shahin",67,87),
                    new StuMark("Mahin",24,76),
                    new StuMark("bAbu",76,96))
    );

    void simple(){
        System.out.println(list);
    }
    Comparator<StuMark> total=new Comparator<StuMark>() {
        @Override
        public int compare(StuMark o1, StuMark o2) {
            int total1=o1.TotalMark();
            int total2=o2.TotalMark();
            if (total1<total2){
                return -1;
            } else if (total1> total2)
            {
                return 1;
            }
//            return o2.getName().compareToIgnoreCase(o1.getName());
            return 0;
        }
    };

    public void  method(){
//        Collections.sort(list,total);
       StuMark max= Collections.max(list,total);
        System.out.println(max);
    }
}

public class Student {
    public static void main(String[ ] args){

        Calculate calculate=new Calculate();
        calculate.simple();
        calculate.method();
    }
}

package QueueSample;
import java.util.PriorityQueue;

class Student implements Comparable<Student> {

    private String name;
    private int tamilMark;
    private int englishMark;
    private int matMark;

    public Student(String name ,int tamilMark, int englishMark, int matMark) {
        this.name=name;
        this.tamilMark = tamilMark;
        this.englishMark = englishMark;
        this.matMark = matMark;
    }


//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//    public int getTamilMark() {
//        return tamilMark;
//    }
//
//    public void setTamilMark(int tamilMark) {
//        this.tamilMark = tamilMark;
//    }
//
//    public int getEnglishMark() {
//        return englishMark;
//    }
//
//    public void setEnglishMark(int englishMark) {
//        this.englishMark = englishMark;
//    }
//
//    public int getMatMark() {
//        return matMark;
//    }
//
//    public void setMatMark(int matMark) {
//        this.matMark = matMark;
//    }

    public int totalMark(){

        return tamilMark+englishMark+matMark;
    }
    @Override
    public String toString() {
        return "Student{" +
                "  name=" + name +
                ", tamilMark=" + tamilMark +
                ", englishMark=" + englishMark +
                ", matMark=" + matMark +
                ", totalMark=" + totalMark()+
                '}'+"\n\n";
    }
    public int compareTo(Student o){

        if(this.totalMark()<o.totalMark()){
            return -1;
        } else if (this.totalMark()>o.totalMark()) {
            return 1;
        }
        return 0;
    }



}

public class CoparablePractice2 {
    public static void main(String[] args) {
        PriorityQueue<Student> s=new PriorityQueue();

        s.offer(new Student("shahin -",35,45,83));
        s.offer(new Student("raja -", 67,35,93));
        s.offer(new Student("aravind -",76,40,90));
        s.offer(new Student("visal -",39,85,83));
        s.offer(new Student("kamal -",55,95,43));


        System.out.println(s);
        while (!s.isEmpty()) {
            System.out.println(s.poll());
        }


    }
}

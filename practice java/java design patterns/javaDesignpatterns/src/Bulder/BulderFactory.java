package Bulder;

class Studend {
    private int id;
    private String name;
    private String department;
    private int total;
    public static StudendBuilder studendBuilder=new StudendBuilder();
    Studend(){}
    private Studend (int id, String name ,String department,int total){
        this.id=id;
        this.name=name;
        this.department=department;
        this.total=total;

    }


    static class StudendBuilder {
        private int id;
        private String name;
        private String department;
        private int total;

        public StudendBuilder id(int id){
            this.id=id;
            return this;
        }
        public StudendBuilder name(String name ){
            this.name =name ;
            return this;
        }
        public StudendBuilder department(String department){
            this.department=department;
            return this;
        }
        public StudendBuilder total(int total){
            this.total=total;
            return this;
        }
        public Studend build(){
            return new Studend(id ,name , department,total);
        }

    }

    @Override
    public String toString() {
        return "Studend{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", total=" + total +
                '}';
    }


}

public class BulderFactory {
    public static void main(String[] args) {
        Studend studend=Studend.studendBuilder.department("MCA").id(103).name("Shain").total(200).build();

        System.out.println(studend);
    }
}

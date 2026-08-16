package SingleDesign;

class Company{


    private int id;
    private String name;

    private static Company company;

    public static Company getCompany(){
        if(company==null){
            company=new Company();
        }
        return company;
    }


    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id=id;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name =name;
    }
    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}

public class SingleDesignPattern {
    public static void main(String[] args) {

        Company company=Company.getCompany();
        company.setName("shahin");
        company.setId(10);
        System.out.println(company);

        Company company1=Company.getCompany();
        company1.setName("Mohammed");
        company1.setId(20);
        System.out.println(company1);
        System.out.println(company);

    }
}

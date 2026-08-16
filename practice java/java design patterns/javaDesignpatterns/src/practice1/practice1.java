package practice1;
import java.util.Arrays;
class TypeOfproduc{

    private int productId;
    private String productName ;

    TypeOfproduc(int productId,String productName){
        this.productId=productId;
        this.productName=productName;
    }
    //bulder patten
    public static ProductBulder productBulder=new ProductBulder();
    static  class ProductBulder{
        private int productId;
        private String productName ;

        public ProductBulder productId(int productId){
            this.productId=productId;
            return this;
        }
        public ProductBulder productName(String productName){
            this.productName=productName;
            return this;
        }
        public TypeOfproduc build() {
            return new TypeOfproduc(productId, productName);
        }
    }
    @Override
    public String toString() {
        return "TypeOfproduc{" +
                "productId=" + productId +
                ", productName='" + productName + '\'' +
                '}';
    }
}

class Database{
    private static Database database;
    int index =0;
    TypeOfproduc[] typeOfproducs=new TypeOfproduc[5];

private Database(){}
    static Database getdatabase(){
        if(database==null){
            database=new Database();
        }
        return database;
    }
    public synchronized void add(TypeOfproduc typeOfproduc){

        if (index< typeOfproducs.length){

            typeOfproducs[index++]=typeOfproduc;
            System.out.println("Product added " +typeOfproduc);
        }

    }
    public synchronized void get(){

        System.out.println(Arrays.toString(typeOfproducs));

    }
}

public class practice1 {
    public static void main(String[] args) {

        Thread t1=new Thread(){
            TypeOfproduc typeOfproduc=TypeOfproduc.productBulder .productId(23).productName("Bike").build();
            TypeOfproduc typeOfproduc1=TypeOfproduc.productBulder .productId(25).productName("car").build();

            TypeOfproduc typeOfproduc2=TypeOfproduc.productBulder .productId(24).productName("Toy").build();
            TypeOfproduc typeOfproduc3=TypeOfproduc.productBulder .productId(27).productName("Cycle").build();


            Database database=Database.getdatabase();
            public void run(){
                database.add(typeOfproduc);
                database.add(typeOfproduc1);
                database.add(typeOfproduc2);
                database.add(typeOfproduc3);
            }
        };
        Thread t2 = new Thread()
        {
            Database database = Database.getdatabase();
            public void run(){
                database.get();
            }
        };
        t1.setPriority(10);
        t2.setPriority(5);
        t1.start();
        t2.start();

    }
}

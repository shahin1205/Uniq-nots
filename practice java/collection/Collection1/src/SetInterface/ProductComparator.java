package SetInterface;

import java.util.*;

class  Product{
    String productName;
    double price;

    Product(String productName,double price){
        this.productName=productName;
        this.price=price;
    }

    @Override
    public String toString() {
        return "\n{" +
                "productName='" + productName + '\'' +
                ", price=" + price +
                '}';
    }
}

class ProductService{
    ArrayList<Product> arr=new ArrayList<>();

    void add(){
        arr.add(new Product("jar",1200));
        arr.add(new Product("laptop",20000));
        arr.add(new Product("phone",38000));
        arr.add(new Product("charger",5000));
    }
    Comparator<Product> ascendingProdect=new Comparator<>() {
        @Override
        public int compare(Product p1,Product p2){
            return Double.compare(p1.price,p2.price);
        }
    };
    Comparator<Product> descendingProduct=new Comparator<Product>() {
        @Override
        public int compare(Product p1,Product p2){
            return Double.compare(p2.price,p1.price);
        }
    };
    void showAscending() {
        TreeSet<Product> has = new TreeSet<>(ascendingProdect);
        has.addAll(arr);
        System.out.println(has);
    }
    void showDescending(){
        TreeSet<Product> has=new TreeSet<>(descendingProduct);
        has.addAll(arr);
        System.out.println(has);
    }
}

class ProductConnector{
    ProductService productService=new ProductService();
    Scanner sc=new Scanner(System.in);
    void connect(){
        productService.add();
        while (true) {
            System.out.println("Press 1 for ascending order and press 2 for descending order and exit 3");
            int num = sc.nextInt();
            switch (num){
                case 1: productService.showAscending();
                break;
                case 2:productService.showDescending();
                break;
                case 3:
                    return;
                default:
                    System.out.println("Enter the correct number ");
            }

        }

    }
}

public class ProductComparator {
    public static void main(String[] args){

        ProductConnector productConnector=new ProductConnector();
        productConnector.connect();
    }
}

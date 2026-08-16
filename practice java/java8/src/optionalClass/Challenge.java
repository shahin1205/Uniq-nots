package optionalClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

class Product{
    int id;
    String name;
    double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
public class Challenge {
    public static ArrayList<Product> list=new ArrayList<>(
            List.of(new Product(12,"Laptop",2000),
                    new Product(13,"Phone",50000),
                    new Product(14,"Charger",5900))
    );

    public static Optional<Product> findProduct(int id){
        for (Product product:list){
            if (product.id==id){
                return Optional.ofNullable(product);
            }
        }
        return Optional.empty();
    }

    public static void main(String[] args) {
        Optional<Product> result=findProduct(2);
        Product p=result.orElse(new Product(0," not found ",0) );
//        result.ifPresent(System.out::println);
        System.out.println(p);

    }
}

package com.example.JpaQueryMethod.Repository;

import com.example.JpaQueryMethod.model.Product;
import jakarta.persistence.NamedNativeQueries;
import jakarta.persistence.NamedNativeQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface NativeQueryRepository extends JpaRepository<Product,Integer> {
    @Query(value ="Select*from product",nativeQuery = true)
    List<Product> getAllProduct();

//    use pojo class
//    @NamedNativeQueries({
//            @NamedNativeQuery(name="Product.getAllProduct",query = "Select*from product",resultClass = Product.class)
//    })
}

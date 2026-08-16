package com.example.JpaQueryMethod.Repository;

import com.example.JpaQueryMethod.model.Product;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface JPQLQueryRepository extends JpaRepository<Product,Integer> {
    @Query("select p from Product p")
    List<Product> getAllProduct();
/////=-----------------------------------------------------------------------------------
//    ithu Pojo Class
//    @NamedQuery(name="Product.getAllProduct",query="select p from Product p",resultClass = Product.class)

//    ithu pojo class la multiple query elutha
//    @NamedQueries({
//            @NamedQuery(name="Product.getAllProduct",query="select p from Product p",resultClass = Product.class)
//    })
//-----------------------------------------------------------------------------
//    @Query("select p from Product p where p.productName=?1 and p.category=?2")
//    List<Product> getProductByName(String productName,String category );

    @Query("select p from Product p where p.productName= :productName and p.category= :category")
    List<Product> getProductByName(String productName,String category );




}

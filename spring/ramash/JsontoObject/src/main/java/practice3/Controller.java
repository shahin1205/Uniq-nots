package practice3;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class Controller {
//    public void controller() {
//        try {
//            ObjectMapper mapper = new ObjectMapper();
//
//        Order order =mapper.readValue(new File("C:\\spring\\JsontoObject\\Json.json"),Order.class);
//        System.out.println(order);
//
//
//        }catch (Exception e){
//            e.printStackTrace();
//        }
//    }
/////    ---------------------------------------------------------------------------------------
//    public void method3() throws JsonProcessingException {
//        Customer customer=new Customer();
//        customer.setId(12);
//         customer.setName("shahin");
//
//         Item item=new Item();
//         item.setProductId(12);
//         item.setProductName("bag");
//         item.setPrice(234);
//         item.setQuantity(3);
//
//        Item item1=new Item();
//        item.setProductId(13);
//        item.setProductName("watch");
//        item.setPrice(234);
//        item.setQuantity(7);
//
//         Order order=new Order();
//         order.setOrderId(12);
//         order.setCustomer(customer);
//         order.setItem(List.of(item,item1));
//         order.setTotalAmount(654);
//
//         ObjectMapper mapper=new ObjectMapper();
//         String json=mapper.writeValueAsString(order);
//        System.out.println(json);
//    }
/////------------------------------------------------------------------------
    public void controller2(){
        String filePath="C:\\SpringJson\\Json.json.txt";
try {
    BufferedReader reader=new BufferedReader(new FileReader(filePath));

    ObjectMapper mapper=new ObjectMapper();
    Order order=mapper.readValue(reader,Order.class);

    System.out.println(order);
}
catch (Exception e){
    e.printStackTrace();
}
    }

}

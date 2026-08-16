package repository;
import Controler.ControlClass;
import com.fasterxml.jackson.core.type.TypeReference;
import  model.Prodect;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/save")
public class ProductSave extends HttpServlet {


    ///====================single data insert =============================
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setContentType("text/plain");
//        ObjectMapper mapper=new ObjectMapper();
//
//        Prodect prodect=mapper.readValue(req.getReader(),Prodect.class);
//
//
//        String name=prodect.getName();
//        int price=prodect.getPrice();
//        int quantity=prodect.getQuantity();
//
//        ControlClass.addProduct(name,price,quantity);
//        resp.getWriter().println("add product");
//
//    }

    //////=====================multiple data insert ==============
////[
    ///{
    ///     "name":"Mobile",
    ///     "price":10000,
    ///     "quantity":2
    ///   },{
    ///     "name":"Laptop",
    ///     "price":50000,
    ///     "quantity":1
    ///   }
    /// ]
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        resp.setContentType("text/plain");

        ObjectMapper mapper = new ObjectMapper();
////TypeReference என்பது Jackson library-ல இருக்கும் ஒரு class.
/// Jackson JSON-ஐ Java Object-ஆ convert பண்ணும்போது Generic Types (List<Prodect>, Map<String, String>) என்ன type என்று தெரியாது. அதனால TypeReference use பண்ணி exact type-ஐ சொல்லணும்.
        List<Prodect> products = mapper.readValue(
                req.getReader(),
                new TypeReference<List<Prodect>>() {}
        );

        for (Prodect p : products) {

            ControlClass.addProduct(
                    p.getName(),
                    p.getPrice(),
                    p.getQuantity()
            );
        }
        resp.getWriter().println("Products Added Successfully");
    }
    }

package controler;
import repository.ControlClass;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import model.Prodect;

import java.io.IOException;

@WebServlet("/update")
public class ProductUpdate extends HttpServlet {
    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/plaine");
        ObjectMapper mapper=new ObjectMapper();

        Prodect prodect=mapper.readValue(req.getReader(),Prodect.class);

        int id =prodect.getId();
        String name=prodect.getName();
        int price=prodect.getPrice();
        int quantity=prodect.getQuantity();

        ControlClass.updateProduct(id,name,price,quantity);
        resp.getWriter().println("update successfully ");
    }
}

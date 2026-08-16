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
@WebServlet("/delete")
public class ProductDelete extends HttpServlet {

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/plain");
        ObjectMapper mapper=new ObjectMapper();

        Prodect prodect=mapper.readValue(req.getReader(),Prodect.class);

        int id =prodect.getId();


        ControlClass.deleteProduct(id);
        resp.getWriter().println("delete");

    }
}

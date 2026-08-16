package repository;
import Controler.ControlClass;
import model.Prodect;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/get")
public class ProductGet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.setContentType("application/json");
//        StringBuilder sb = new StringBuilder();
//
//        sb.append("[");
//        for (int i=0;i<ControlClass.list.size();i++){
//            Prodect prodect=ControlClass.list.get(i);
//            sb.append("{").append("\"id\":"+prodect.getId() +"\",");
//            sb.append("{").append("\"name\":"+prodect.getName() +"\",");
//            sb.append("{").append("\"price\":"+prodect.getPrice() +"\",");
//            sb.append("{").append("\"quantity\":"+prodect.getQuantity() +"\"}");
//
//            if (i!=ControlClass.list.size()-1){
//                sb.append(",");
//            }
//        }
//        sb.append("]");
//
//        String json= sb.toString();
//        resp.getWriter().println(json);
//
//



        ObjectMapper mapper=new ObjectMapper();
        resp.setContentType("application/json");
        mapper.writeValue(resp.getWriter(),ControlClass.getProduct());

    }
}

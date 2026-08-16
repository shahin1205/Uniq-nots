package requestDispatcher;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/A")
public class ClassA extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//        super.doGet(req, resp);

        RequestDispatcher rd=req.getRequestDispatcher("/B");
        rd.forward(req,res);
        System.out.println("A");

        String name =req.getParameter("name");
        System.out.println(name);
    }
}

//http://localhost:8080/ServletEnpoint/A?name=sample
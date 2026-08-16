package sendredirect;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet("/redirect1")
public class redirect1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//        super.doGet(req, resp);

        res.sendRedirect("redirect2?name=sample");
//        System.out.println("redirect1");
//
//        String name =req.getParameter("name");
//        System.out.println("redirect1 - "+name);

    }
}

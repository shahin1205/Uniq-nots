package miniProject1;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/register")
public class Register extends HttpServlet {

//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//        res.setContentType("text/html");
//        PrintWriter out=res.getWriter();
//        out.println("<form action=\"register\" method=\"post\">\n" +
//                "    <label for=\"id\" >id</label>\n" +
//                "    <input type=\"text\" name=\"id\" id=\"id\">\n" +
//                "\n" +
//                "    <label for=\"name\" >name</label>\n" +
//                "    <input type=\"text\" name=\"name\" id=\"name\">\n" +
//                "\n" +
//                "    <label for=\"password\" >password</label>\n" +
//                "    <input type=\"password\" name=\"password\" id=\"password\">\n" +
//                "\n" +
//                "    <button type=\"submit\"> submit</button>\n" +
//                "    </form>\n"
//        );
//    }


    @Override
    protected void doGet(HttpServletRequest req,
                         HttpServletResponse resp)
            throws ServletException, IOException {

        req.getRequestDispatcher("register.html")
                .forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();

        int id=Integer.parseInt(req.getParameter("id"));
        String name=req.getParameter("name");
        String password=req.getParameter("password");

        Repository.addUser(id,name,password);
       out.println("name - "+ name+ " password - "+ password );
    }
}

package miniProject1;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class Login extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//
//        resp.setContentType("text/html");
//        PrintWriter out=resp.getWriter();
//
//        out.println(
//                "<form action=\"login\" method=\"post\">\n" +
//                "    <label for=\"name\" >name</label>\n" +
//                "    <input type=\"text\" name=\"name\" id=\"name\">\n" +
//                "\n" +
//                "    <label for=\"password\" >password</label>\n" +
//                "    <input type=\"password\" name=\"password\" id=\"password\">\n" +
//                "\n" +
//                "    <button type=\"submit\"> submit</button>\n" +
//                "    </form>\n"
//        );
//
//    }

    @Override
    protected void doGet(HttpServletRequest req,
                         HttpServletResponse resp)
            throws ServletException, IOException {

        req.getRequestDispatcher("login.html")
                .forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out=resp.getWriter();

        String name=req.getParameter("name");
        String password=req.getParameter("password");

//        Repository.loginUser(name,password);
        out.println(Repository.loginUser(name,password));
    }
}

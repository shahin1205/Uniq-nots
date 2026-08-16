package EnpoinConnection;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/content")
public class ContentType extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {

        ////-------------text/html------------------------
//        res.setContentType("text/html");
//        PrintWriter out=res.getWriter();
//        out.println("<h1>hello</h1>");

        ////---------------text/plain-----------------

//        res.setContentType("text/plain");
//        PrintWriter out = res.getWriter();
//        out.println("Hello User");
//        out.println("Welcome to Servlet");

        ////--------------application/json------------

//        res.setContentType("application/json");
//        PrintWriter out = res.getWriter();
//        out.print("{"
//                + "\"id\":1,"
//                + "\"name\":\"Shahin\","
//                + "\"course\":\"Java\""
//                + "}");

        ////--------------------------application/xml-------------------
        res.setContentType("application/xml");

        PrintWriter out = res.getWriter();

        String xml =
                        "<user>" +
                        "<id>1</id>" +
                        "<name>Shahin</name>" +
                        "</user>";

        out.print(xml);
    }
}

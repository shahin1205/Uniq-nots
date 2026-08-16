package supportingInterface;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class SupportingInterface2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        ServletConfig config=super.getServletConfig();
        String username=config.getInitParameter("username");
        String password=config.getInitParameter("password");
        System.out.println(username+" - "+ password);

//        --------------------------------------------------------------
//        ServletContext context=config.getServletContext();
//        String url= context.getInitParameter("url");
//        System.out.println(url);
//        --------------------or-------------------
        ServletContext context=super.getServletContext();
        String url= context.getInitParameter("url");
        System.out.println(url);
    }
}

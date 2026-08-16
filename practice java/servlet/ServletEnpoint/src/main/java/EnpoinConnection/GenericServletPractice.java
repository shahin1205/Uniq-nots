package EnpoinConnection;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/generic")
public class GenericServletPractice extends GenericServlet {

    @Override
    public  void init(){
        System.out.println("override the init");
    }


    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Handle the all method");
    }
}

package EnpoinConnection;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;
import java.io.IOException;

@WebServlet("/lifeCycle")

public class ServletLifeCycle implements Servlet {
    ServletConfig config;
    @Override
    public void init(ServletConfig config) throws ServletException {
        System.out.println("run init");
        this.config=config;
    }

    @Override
    public ServletConfig getServletConfig() {
        return config;
    }

    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {

        System.out.println("run service");
    }

    @Override
    public String getServletInfo() {
        return "";
    }

    @Override
    public void destroy() {

        System.out.println("run destroy");
    }
}

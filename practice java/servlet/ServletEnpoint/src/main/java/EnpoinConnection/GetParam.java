package EnpoinConnection;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.BufferedReader;
import java.io.IOException;
@WebServlet("/get")
public class GetParam extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);

        String username=req.getParameter("username");
        String password=req.getParameter("password");
        System.out.println(username+ " - "+ password);
//        http://localhost:8080/ServletEnpoint/get?username=mango&password=banana

        BufferedReader bf=req.getReader();
        int ch;
        while ((ch=bf.read())!=-1){
            System.out.print((char) ch);
        }
        //past this is post man : http://localhost:8080/ServletEnpoint/get
//        {
//            "id": 1,
//                "name": "resh",
//                "email":"resh@1205",
//                "price":4567
//        }

        System.out.println("Client IP : " + req.getRemoteAddr());

        System.out.println("Protocol : " + req.getProtocol());

        System.out.println("Server Name : " + req.getServerName());

        System.out.println("Server Port : " + req.getServerPort());

        System.out.println("Request URL : " + req.getRequestURL());

        System.out.println("Request URI : " + req.getRequestURI());

        System.out.println("Context Path : " + req.getContextPath());

        System.out.println("Method : " + req.getMethod());
    }
}

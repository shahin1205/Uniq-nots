package EnpoinConnection;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class UserDetails{
    private int id;
    private String name;
    private String email;
    private  int price;

    public UserDetails(int id, String name, String email, int price) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}

@WebServlet("/user")
public class User extends HttpServlet {
    private ArrayList<UserDetails> list=new ArrayList<>(Arrays.asList(
            new UserDetails(1, "shahin", "shahin@gmail.com", 234),
            new UserDetails(2, "mahin", "mahin@gmail.com", 567),
            new UserDetails(3, "visal", "visal@gmail.com", 876),
            new UserDetails(4, "gokul", "gokul@gmail.com", 876)
    ));

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("application/json");
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < list.size(); i++) {
            UserDetails userDetails = list.get(i);
            sb.append("{").append("\"id\":" + userDetails.getId() + ",");
            sb.append("\"name\":" + userDetails.getName() + "\",");
            sb.append("\"email\":" + userDetails.getEmail() + "\",");
            sb.append("\"price\":" + userDetails.getPrice() + "\"}");
            if (i != list.size() - 1) {
                sb.append(",\n");

            }

        }
        sb.append("]");
        String jsonResponse = sb.toString();
        res.getWriter().println(jsonResponse);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
//        super.doPost(req, resp);
        int id=Integer.parseInt(req.getParameter("id"));
        String name=req.getParameter("name");
        String email=req.getParameter("email");
        int price=Integer.parseInt(req.getParameter("price"));

        UserDetails userDetails=new UserDetails(id,name,email,price);
        list.add(userDetails);
        res.setContentType("text/plain");
        res.getWriter().println("added");

    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        int id=Integer.parseInt(req.getParameter("id"));

        res.setContentType("text/plain");

        for (int i=0;i<list.size();i++){
            if(list.get(i).getId()==id){
                list.remove(i);
                res.getWriter().println("remove success full");
                return;
            }
        }
        res.getWriter().println("user not foud");
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id=Integer.parseInt(req.getParameter("id"));
        String name = req.getParameter("name");
        String email=req.getParameter("email");
        int price=Integer.parseInt(req.getParameter("price"));

        resp.setContentType("text/plain");
        for(UserDetails user: list){
            if (user.getId()==id){
                user.setName(name);
                user.setEmail(email);
                user.setPrice(price);
                resp.getWriter().println("update success full");
                return;
            }
        }
        resp.getWriter().println("user not fount");
    }
}


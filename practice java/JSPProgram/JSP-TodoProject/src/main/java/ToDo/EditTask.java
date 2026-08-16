package ToDo;

import Domin.Task;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet("/edit")
public class EditTask extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id=Integer.parseInt(req.getParameter("id"));

        Task editUser=null;

        for (Task task:AddProduct.list){
            if (task.getId()==id){
                editUser=task;
                break;
            }
        }
        req.setAttribute("task",editUser);
        req.getRequestDispatcher("addProduct.jsp").forward(req,resp);
    }
}

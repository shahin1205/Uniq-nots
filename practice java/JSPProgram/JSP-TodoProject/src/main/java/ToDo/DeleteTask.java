package ToDo;

import Domin.Task;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
@WebServlet("/delete")
public class DeleteTask  extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        int id=Integer.parseInt(req.getParameter("id"));

        Task deleteUser=null;

        for (Task task:AddProduct.list){
            if (task.getId()==id){
                deleteUser=task;
                break;
            }
        }

        if (deleteUser!=null){
            AddProduct.list.remove(deleteUser);
        }
        resp.sendRedirect("view");
    }
}

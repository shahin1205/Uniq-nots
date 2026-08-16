package ToDo;

import Domin.Task;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;

@WebServlet("/add")
public class AddProduct extends HttpServlet {
    public static ArrayList<Task> list=new ArrayList<>();
    static int addid=0;
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

//        int id = Integer.parseInt(req.getParameter("id"));
        int id=addid++;
        String taskName= req.getParameter("taskName");
        String name=   req.getParameter("name");
        String email=  req.getParameter("email");

        Task task=new Task(id,taskName,name,email);

                Task existingUser=null;
            for (Task task1:list){
                if(task1.getId()==id){
                    existingUser=task1;
                }
            }

            if(existingUser==null){
                list.add(task);
            }
            else {
                existingUser.setTaskName(taskName);
                existingUser.setName(name);
                existingUser.setEmail(email);
            }

        req.setAttribute("task",list);

        req.getRequestDispatcher("/view.jsp").forward(req,resp);
    }
}

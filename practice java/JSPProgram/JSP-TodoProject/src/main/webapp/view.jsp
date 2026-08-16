<%@ page import="ToDo.AddProduct" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="Domin.Task" %>
<%@ page import="static ToDo.AddProduct.list" %><%--
  Created by IntelliJ IDEA.
  User: shahin
  Date: 6/12/2026
  Time: 3:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<head>
    <title>Task List</title>

    <style>
        *{
            margin:0;
            padding:0;
            box-sizing:border-box;
            font-family:'Segoe UI',sans-serif;
        }

        body{
            min-height:100vh;
            background:linear-gradient(135deg,#667eea,#764ba2);
            display:flex;
            justify-content:center;
            align-items:center;
            padding:30px;
        }

        .container{
            width:95%;
            max-width:1000px;
            background:white;
            padding:30px;
            border-radius:20px;
            box-shadow:0 15px 40px rgba(0,0,0,0.2);
        }

        h1{
            text-align:center;
            color:#333;
            margin-bottom:25px;
        }

        table{
            width:100%;
            border-collapse:collapse;
            overflow:hidden;
            border-radius:15px;
        }

        th{
            background:#4f46e5;
            color:white;
            padding:15px;
            text-transform:uppercase;
        }

        td{
            padding:12px;
            text-align:center;
        }

        tr:nth-child(even){
            background:#f4f4f4;
        }

        tr:hover{
            background:#e0e7ff;
            transition:.3s;
        }

        .edit-btn{
            background:#10b981;
            color:white;
            text-decoration:none;
            padding:8px 15px;
            border-radius:8px;
            font-weight:bold;
        }

        .edit-btn:hover{
            background:#059669;
        }

        .delete-btn{
            background:#ef4444;
            color:white;
            text-decoration:none;
            padding:8px 15px;
            border-radius:8px;
            font-weight:bold;
        }

        .delete-btn:hover{
            background:#dc2626;
        }

        .btn-container{
            display:flex;
            justify-content:center;
            margin-top:25px;
        }

        .add-btn{
            background:linear-gradient(135deg,#00c853,#64dd17);
            color:white;
            border:none;
            padding:15px 30px;
            border-radius:10px;
            font-size:16px;
            font-weight:bold;
            cursor:pointer;
            transition:.3s;
        }

        .add-btn:hover{
            transform:translateY(-3px);
            box-shadow:0 10px 20px rgba(0,0,0,0.2);
        }
    </style>
</head>
<body>

<div class="container">

    <h1>📋 Task Management System</h1>

    <table>
        <tr>
            <th>ID</th>
            <th>Task</th>
            <th>Name</th>
            <th>Email</th>
            <th colspan="2">Action</th>
        </tr>

        <% for(Task taks: list) { %>
        <tr>
            <td><%=taks.getId()%></td>
            <td><%=taks.getTaskName()%></td>
            <td><%=taks.getName()%></td>
            <td><%=taks.getEmail()%></td>

            <td>
                <a class="edit-btn"
                   href="edit?id=<%=taks.getId()%>">
                    Edit
                </a>
            </td>

            <td>
                <a class="delete-btn"
                   href="delete?id=<%=taks.getId()%>"
                   onclick="return confirm('Are you sure you want to delete this task?')">
                    Delete
                </a>
            </td>
        </tr>
        <% } %>
    </table>

    <div class="btn-container">
        <form action="addProduct.jsp" method="post">
            <button class="add-btn" type="submit">
                ➕ Add Task
            </button>
        </form>
        <br>
        <form action="index.jsp" method="post">
            <button class="add-btn" type="submit">
                ➕ Index Page
            </button>
        </form>
    </div>

</div>

</body>
</html>

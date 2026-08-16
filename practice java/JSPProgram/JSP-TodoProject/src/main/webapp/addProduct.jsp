<%@ page import="Domin.Task" %>
<%@ page import="ToDo.AddProduct" %><%--
  Created by IntelliJ IDEA.
  User: shahin
  Date: 6/12/2026
  Time: 11:03 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<style>
    *{
        margin:0;
        padding:0;
        box-sizing:border-box;
        font-family:'Segoe UI',sans-serif;
    }

    body{
        min-height:100vh;
        display:flex;
        justify-content:center;
        align-items:center;
        background:linear-gradient(135deg,#6a11cb,#2575fc);
    }

    .container{
        width:450px;
        background:white;
        padding:35px;
        border-radius:20px;
        box-shadow:0 15px 35px rgba(0,0,0,0.2);
    }

    h1{
        text-align:center;
        color:#333;
        margin-bottom:25px;
    }

    label{
        display:block;
        margin-bottom:6px;
        font-weight:bold;
        color:#444;
    }

    input{
        width:100%;
        padding:12px;
        border:2px solid #ddd;
        border-radius:10px;
        margin-bottom:15px;
        font-size:15px;
        transition:0.3s;
    }

    input:focus{
        outline:none;
        border-color:#2575fc;
        box-shadow:0 0 10px rgba(37,117,252,0.3);
    }

    button{
        width:100%;
        padding:14px;
        border:none;
        border-radius:10px;
        background:linear-gradient(135deg,#00c853,#64dd17);
        color:white;
        font-size:18px;
        font-weight:bold;
        cursor:pointer;
        transition:0.3s;
    }

    button:hover{
        transform:translateY(-3px);
        box-shadow:0 8px 20px rgba(0,0,0,0.2);
    }

    .form-title{
        text-align:center;
        font-size:28px;
        color:#2575fc;
        margin-bottom:20px;
    }
</style>
<body>

<div class="container">

    <div class="form-title">
        Task Management
    </div>
    <% Task task = (Task) request.getAttribute("task"); %>

    <form action="add" method="post">

<%--        <label for="id">ID</label>--%>
<%--        <input type="number" name="id" id="id"--%>
<%--               value="<%= task != null ? task.getId() : "" %>">--%>

        <label for="taskName">Task Name</label>
        <input type="text" name="taskName" id="taskName"
               value="<%= task != null ? task.getTaskName() : "" %>">

        <label for="name">Name</label>
        <input type="text" name="name" id="name"
               value="<%= task != null ? task.getName() : "" %>">

        <label for="email">Email</label>
        <input type="text" name="email" id="email"
               value="<%= task != null ? task.getEmail() : "" %>">

        <button type="submit">
            Save Task
        </button>

    </form>

</div>

</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: shahin
  Date: 6/14/2026
  Time: 5:05 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<%@ page import="com.moviebooking.dao.UserDAO" %>
<%@ page import="com.moviebooking.model.User" %>

<%
  UserDAO dao = new UserDAO();
  List<User> users = dao.getAllUsers();
%>

<!DOCTYPE html>
<html>
<head>
  <title>Users Management</title>

  <style>

    *{
      margin:0;
      padding:0;
      box-sizing:border-box;
      font-family:'Segoe UI',sans-serif;
    }

    body{
      min-height:100vh;
      background:linear-gradient(135deg,#141E30,#243B55);
      padding:30px;
    }

    h1{
      text-align:center;
      color:white;
      margin-bottom:30px;
    }

    .table-container{
      max-width:1100px;
      margin:auto;
      background:rgba(255,255,255,0.1);
      backdrop-filter:blur(15px);
      border-radius:20px;
      padding:20px;
      box-shadow:0 8px 25px rgba(0,0,0,0.4);
      overflow-x:auto;
    }

    table{
      width:100%;
      border-collapse:collapse;
      color:white;
    }

    th{
      background:#00C9A7;
      color:white;
      padding:15px;
    }

    td{
      padding:15px;
      text-align:center;
      border-bottom:1px solid rgba(255,255,255,0.2);
    }

    tr:hover{
      background:rgba(255,255,255,0.1);
    }

    .admin{
      background:#dc3545;
      padding:6px 12px;
      border-radius:20px;
      font-weight:bold;
    }

    .user{
      background:#28a745;
      padding:6px 12px;
      border-radius:20px;
      font-weight:bold;
    }

    .empty{
      text-align:center;
      color:white;
      font-size:24px;
      margin-top:100px;
    }

    .back-btn{
      display:block;
      width:220px;
      margin:25px auto;
      text-align:center;
      text-decoration:none;
      padding:12px;
      background:#007bff;
      color:white;
      border-radius:10px;
      font-weight:bold;
    }

    .back-btn:hover{
      background:#0069d9;
    }

  </style>

</head>

<body>

<h1>👥 Registered Users</h1>

<%
  if(users.isEmpty()){
%>

<div class="empty">
  No Users Found
</div>

<%
}else{
%>

<div class="table-container">

  <table>

    <tr>
      <th>ID</th>
      <th>Name</th>
      <th>Email</th>
      <th>Role</th>
    </tr>

    <%
      for(User user : users){
    %>

    <tr>

      <td>
        <%= user.getId() %>
      </td>

      <td>
        <%= user.getName() %>
      </td>

      <td>
        <%= user.getEmail() %>
      </td>

      <td>

        <%
          if("ADMIN".equalsIgnoreCase(user.getRole())){
        %>

        <span class="admin">
                    ADMIN
                </span>

        <%
        }else{
        %>

        <span class="user">
                    USER
                </span>

        <%
          }
        %>

      </td>

    </tr>

    <%
      }
    %>

  </table>

</div>

<%
  }
%>

<a href="adminDashboard.jsp" class="back-btn">
  ⬅ Back To Dashboard
</a>

</body>
</html>
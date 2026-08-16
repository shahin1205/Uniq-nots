<%--
  Created by IntelliJ IDEA.
  User: shahin
  Date: 6/14/2026
  Time: 4:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="com.moviebooking.model.User" %>

<%
  User user = (User) session.getAttribute("user");

  if(user == null){
    response.sendRedirect("login.jsp");
    return;
  }
%>

<!DOCTYPE html>
<html>
<head>
  <title>Admin Dashboard</title>

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
      display:flex;
      justify-content:center;
      align-items:center;
    }

    .dashboard{
      width:500px;
      background:rgba(255,255,255,0.1);
      backdrop-filter:blur(15px);
      border-radius:20px;
      padding:40px;
      text-align:center;
      color:white;
      box-shadow:0 8px 32px rgba(0,0,0,0.4);
    }

    h1{
      margin-bottom:10px;
    }

    p{
      margin-bottom:30px;
      color:#ddd;
    }

    .menu{
      display:flex;
      flex-direction:column;
      gap:15px;
    }

    .menu a{
      text-decoration:none;
      padding:15px;
      border-radius:10px;
      font-size:18px;
      font-weight:bold;
      color:white;
      transition:0.3s;
    }

    .add{
      background:#28a745;
    }

    .view{
      background:#007bff;
    }

    .logout{
      background:#dc3545;
    }

    .menu a:hover{
      transform:scale(1.05);
    }

    @media(max-width:600px){

      .dashboard{
        width:90%;
        padding:25px;
      }

      h1{
        font-size:24px;
      }

    }

  </style>

</head>

<body>

<div class="dashboard">

  <h1>🎬 Admin Dashboard</h1>

  <p>
    Welcome,
    <strong><%= user.getName() %></strong>
  </p>

  <div class="menu">

    <a href="addMovie.jsp" class="add">
      ➕ Add Movie
    </a>

    <a href="viewMovies.jsp" class="view">
      🎥 View Movies
    </a>

    <a href="logout" class="logout">
      🚪 Logout
    </a>

  </div>

</div>

</body>
</html>
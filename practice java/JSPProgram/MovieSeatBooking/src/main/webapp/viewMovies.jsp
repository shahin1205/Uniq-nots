<%--
  Created by IntelliJ IDEA.
  User: shahin
  Date: 6/14/2026
  Time: 4:49 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="java.util.*" %>
<%@ page import="com.moviebooking.dao.MovieDAO" %>
<%@ page import="com.moviebooking.model.Movie" %>
<%@ page import="com.moviebooking.model.User" %>

<%
  User user =
          (User)session.getAttribute("user");

  MovieDAO dao =
          new MovieDAO();

  List<Movie> movies =
          dao.getAllMovies();
%>

<!DOCTYPE html>
<html>
<head>
  <title>Movies</title>

  <style>

    body{
      font-family:Arial;
      background:#f5f5f5;
      padding:20px;
    }

    h1{
      text-align:center;
    }

    table{
      width:100%;
      border-collapse:collapse;
      background:white;
    }

    th,td{
      border:1px solid #ddd;
      padding:12px;
      text-align:center;
    }

    th{
      background:#343a40;
      color:white;
    }

    .delete-btn{
      background:red;
      color:white;
      padding:8px 15px;
      text-decoration:none;
      border-radius:5px;
    }

    .book-btn{
      background:green;
      color:white;
      padding:8px 15px;
      text-decoration:none;
      border-radius:5px;
    }
    .home-btn{

      text-decoration:none;
      background:#28a745;
      color:white;

      padding:10px 20px;

      border-radius:8px;

      font-weight:bold;
    }
  </style>

</head>

<body>
<a href="home" class="home-btn">
  🏠 Home
</a>
<h1>Movie List</h1>

<table>

  <tr>

    <th>Movie Name</th>
    <th>Date</th>
    <th>Time</th>
    <th>Price</th>

    <%
      if(user != null &&
              user.getRole().equalsIgnoreCase("ADMIN")){
    %>

    <th>Delete</th>

    <%
    }else{
    %>

    <th>Book</th>

    <%
      }
    %>

  </tr>

  <%
    for(Movie movie : movies){
  %>

  <tr>

    <td>
      <%=movie.getMovieName()%>
    </td>

    <td>
      <%=movie.getShowDate()%>
    </td>

    <td>
      <%=movie.getShowTime()%>
    </td>

    <td>
      Rs.<%=movie.getPrice()%>
    </td>

    <%
      if(user != null &&
              user.getRole().equalsIgnoreCase("ADMIN")){
    %>

    <td>

      <a class="delete-btn"
         href="deleteMovie?id=<%=movie.getId()%>"
         onclick="return confirm('Delete this movie?')">

        Delete

      </a>

    </td>

    <%
    }else{
    %>

    <td>

      <a class="book-btn"
         href="seatSelection.jsp?movieId=<%=movie.getId()%>">

        Book Seat

      </a>

    </td>

    <%
      }
    %>

  </tr>

  <%
    }
  %>

</table>

</body>
</html>
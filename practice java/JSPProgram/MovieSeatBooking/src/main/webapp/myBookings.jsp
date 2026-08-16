<%--
  Created by IntelliJ IDEA.
  User: shahin
  Date: 6/14/2026
  Time: 5:01 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<%@ page import="com.moviebooking.dao.BookingDAO" %>
<%@ page import="com.moviebooking.model.*" %>
<%@ page import="com.moviebooking.dao.MovieDAO" %>

<%
  User user = (User) session.getAttribute("user");

  if(user == null){
    response.sendRedirect("login.jsp");
    return;
  }
  MovieDAO movieDAO = new MovieDAO();

  BookingDAO dao = new BookingDAO();
  List<Booking> bookings = dao.getBookingsByUserId(user.getId());
%>

<!DOCTYPE html>
<html>
<head>
  <title>My Bookings</title>

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

    .container{
      display:grid;
      grid-template-columns:repeat(auto-fit,minmax(320px,1fr));
      gap:25px;
    }

    .booking-card{
      background:rgba(255,255,255,0.1);
      backdrop-filter:blur(15px);
      border-radius:20px;
      padding:25px;
      color:white;
      box-shadow:0 8px 25px rgba(0,0,0,0.4);
      transition:0.3s;
    }

    .booking-card:hover{
      transform:translateY(-8px);
    }

    .title{
      font-size:22px;
      color:#00C9A7;
      margin-bottom:15px;
      font-weight:bold;
    }

    .info{
      margin:10px 0;
      font-size:16px;
    }

    .cancel-btn{
      display:block;
      margin-top:20px;
      text-align:center;
      text-decoration:none;
      background:#dc3545;
      color:white;
      padding:12px;
      border-radius:10px;
      font-weight:bold;
      transition:0.3s;
    }

    .cancel-btn:hover{
      background:#b52a37;
      transform:scale(1.03);
    }

    .empty{
      text-align:center;
      color:white;
      margin-top:100px;
      font-size:25px;
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
<h1>🎟 My Bookings</h1>

<%
  for(Booking booking : bookings){
%>

<div class="booking-card">

  <div class="title">
    Booking #<%= booking.getId() %>
  </div>

  <div class="info">
    🎬 Movie Name :
    <%= movieDAO.getMovieNameById(booking.getMovieId()) %>
  </div>

  <div class="info">
    💺 Seat :
    <%= booking.getSeatNumber() %>
  </div>

  <a class="cancel-btn"
     onclick="return confirm('Are you sure you want to cancel this booking?')"
     href="cancelBooking?id=<%=booking.getId()%>&movieId=<%=booking.getMovieId()%>&seat=<%=booking.getSeatNumber()%>">

    ❌ Cancel Booking

  </a>

</div>

<%
  }
%>
</body>
</html>
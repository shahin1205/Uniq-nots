<%--
  Created by IntelliJ IDEA.
  User: shahin
  Date: 6/14/2026
  Time: 5:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<%@ page import="com.moviebooking.dao.BookingDAO" %>
<%@ page import="com.moviebooking.model.Booking" %>

<%
  BookingDAO dao = new BookingDAO();
  List<Booking> bookings = dao.getAllBookings();
%>

<!DOCTYPE html>
<html>
<head>
  <title>All Bookings</title>

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
      max-width:1200px;
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
      padding:15px;
    }

    td{
      padding:15px;
      text-align:center;
      border-bottom:1px solid rgba(255,255,255,0.2);
    }

    tr:hover{
      background:rgba(255,255,255,0.08);
    }

    .booking-id{
      color:#ffc107;
      font-weight:bold;
    }

    .seat{
      background:#28a745;
      padding:6px 12px;
      border-radius:15px;
      font-weight:bold;
    }

    .empty{
      text-align:center;
      color:white;
      margin-top:100px;
      font-size:25px;
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
<h1>🎟 All Bookings</h1>

<%
  if(bookings.isEmpty()){
%>

<div class="empty">
  No Bookings Available
</div>

<%
}else{
%>

<div class="table-container">

  <table>

    <tr>
      <th>Booking ID</th>
      <th>User ID</th>
      <th>Movie ID</th>
      <th>Seat Number</th>
    </tr>

    <%
      for(Booking booking : bookings){
    %>

    <tr>

      <td class="booking-id">
        #<%= booking.getId() %>
      </td>

      <td>
        <%= booking.getUserId() %>
      </td>

      <td>
        <%= booking.getMovieId() %>
      </td>

      <td>
                <span class="seat">
                    <%= booking.getSeatNumber() %>
                </span>
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
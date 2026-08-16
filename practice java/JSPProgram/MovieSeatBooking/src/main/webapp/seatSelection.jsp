<%--
  Created by IntelliJ IDEA.
  User: shahin
  Date: 6/14/2026
  Time: 4:51 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.*" %>
<%@ page import="com.moviebooking.dao.SeatDAO" %>
<%@ page import="com.moviebooking.model.Seat" %>

<%
    int movieId = Integer.parseInt(request.getParameter("movieId"));

    SeatDAO dao = new SeatDAO();
    List<Seat> seats = dao.getSeatsByMovieId(movieId);
%>

<!DOCTYPE html>
<html>
<head>
    <title>Select Seats</title>

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
            color:white;
            text-align:center;
            padding:30px;
        }

        h2{
            margin-bottom:20px;
        }

        .screen{
            width:80%;
            margin:20px auto;
            padding:15px;
            background:white;
            color:black;
            border-radius:50px;
            font-weight:bold;
            box-shadow:0 0 20px rgba(255,255,255,0.5);
        }

        .seat-container{
            display:flex;
            flex-wrap:wrap;
            justify-content:center;
            gap:12px;
            max-width:900px;
            margin:auto;
        }

        .seat{
            position:relative;
        }

        .seat input{
            display:none;
        }

        .seat label{
            display:flex;
            justify-content:center;
            align-items:center;
            width:60px;
            height:60px;
            border-radius:10px;
            cursor:pointer;
            font-weight:bold;
            transition:0.3s;
        }

        .available{
            background:#28a745;
            color:white;
        }

        .available:hover{
            transform:scale(1.1);
        }

        .seat input:checked + label{
            background:#ffc107;
            color:black;
        }

        .booked{
            width:60px;
            height:60px;
            background:#dc3545;
            border-radius:10px;
            display:flex;
            justify-content:center;
            align-items:center;
            font-weight:bold;
            cursor:not-allowed;
        }

        .legend{
            margin:25px;
            display:flex;
            justify-content:center;
            gap:25px;
        }

        .box{
            width:20px;
            height:20px;
            display:inline-block;
            margin-right:5px;
            border-radius:4px;
        }

        .btn{
            margin-top:30px;
            padding:15px 40px;
            border:none;
            border-radius:10px;
            background:#00C9A7;
            color:white;
            font-size:18px;
            cursor:pointer;
            transition:0.3s;
        }

        .btn:hover{
            background:#00a98d;
            transform:scale(1.05);
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
<h2>🎟 Select Your Seats</h2>

<div class="screen">
    SCREEN
</div>

<div class="legend">
    <div>
        <span class="box" style="background:#28a745"></span>
        Available
    </div>

    <div>
        <span class="box" style="background:#ffc107"></span>
        Selected
    </div>

    <div>
        <span class="box" style="background:#dc3545"></span>
        Booked
    </div>
</div>

<form action="bookSeat"
      method="post"
      onsubmit="return validateSeat()">
    <input type="hidden"
           name="movieId"
           value="<%=movieId%>">

    <div class="seat-container">

        <%
            for(Seat seat : seats){

                if("AVAILABLE".equals(seat.getStatus())){
        %>

        <div class="seat">

            <input type="checkbox"
                   id="<%=seat.getSeatNumber()%>"
                   name="seat"
                   value="<%=seat.getSeatNumber()%>">

            <label class="available"
                   for="<%=seat.getSeatNumber()%>">
                <%=seat.getSeatNumber()%>
            </label>

        </div>

        <%
        }else{
        %>

        <div class="booked">
            <%=seat.getSeatNumber()%>
        </div>

        <%
                }
            }
        %>

    </div>

    <button type="submit" class="btn">
        Confirm Booking
    </button>

</form>
<script>

    function validateSeat(){

        let seats =
            document.querySelectorAll(
                'input[name="seat"]:checked'
            );

        if(seats.length === 0){

            alert("Please select at least one seat");

            return false;
        }

        return true;
    }

</script>
</body>
</html>
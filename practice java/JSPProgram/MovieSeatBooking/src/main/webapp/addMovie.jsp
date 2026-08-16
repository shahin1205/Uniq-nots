<%--
  Created by IntelliJ IDEA.
  User: shahin
  Date: 6/14/2026
  Time: 4:33 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
  <title>Add Movie</title>

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
      background:linear-gradient(135deg,#141E30,#243B55);
      padding:20px;
    }

    .container{
      width:550px;
      background:rgba(255,255,255,0.1);
      backdrop-filter:blur(15px);
      border-radius:20px;
      padding:35px;
      color:white;
      box-shadow:0 8px 32px rgba(0,0,0,0.4);
    }

    h2{
      text-align:center;
      margin-bottom:25px;
      font-size:32px;
    }

    .input-group{
      margin-bottom:18px;
    }

    label{
      display:block;
      margin-bottom:8px;
      font-weight:bold;
    }

    input{
      width:100%;
      padding:12px;
      border:none;
      border-radius:10px;
      outline:none;
      font-size:15px;
    }

    .btn{
      width:100%;
      padding:14px;
      border:none;
      border-radius:10px;
      background:#28a745;
      color:white;
      font-size:18px;
      font-weight:bold;
      cursor:pointer;
      transition:0.3s;
    }

    .btn:hover{
      transform:scale(1.03);
      background:#218838;
    }

    .back{
      text-align:center;
      margin-top:20px;
    }

    .back a{
      color:#00C9A7;
      text-decoration:none;
      font-weight:bold;
    }

    .back a:hover{
      text-decoration:underline;
    }

    @media(max-width:600px){

      .container{
        width:95%;
        padding:25px;
      }

      h2{
        font-size:25px;
      }
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
<div class="container">

  <h2>🎬 Add Movie</h2>

  <form action="addMovie" method="post">

    <div class="input-group">
      <label>Movie Name</label>
      <input type="text"
             name="movieName"
             placeholder="Enter Movie Name"
             required>
    </div>

    <div class="input-group">
      <label>Show Date</label>
      <input type="date"
             name="showDate"
             required>
    </div>

    <div class="input-group">
      <label>Show Time</label>
      <input type="time"
             name="showTime"
             required>
    </div>

    <div class="input-group">
      <label>Ticket Price (₹)</label>
      <input type="number"
             name="price"
             placeholder="Enter Ticket Price"
             required>
    </div>

    <div class="input-group">
      <label>Total Rows</label>
      <input type="number"
             name="rowsCount"
             placeholder="Example: 10"
             required>
    </div>

    <div class="input-group">
      <label>Seats Per Row</label>
      <input type="number"
             name="seatsPerRow"
             placeholder="Example: 12"
             required>
    </div>

    <button type="submit" class="btn">
      ➕ Add Movie
    </button>

  </form>

  <div class="back">
    <a href="adminDashboard.jsp">⬅ Back to Dashboard</a>
  </div>

</div>

</body>
</html>
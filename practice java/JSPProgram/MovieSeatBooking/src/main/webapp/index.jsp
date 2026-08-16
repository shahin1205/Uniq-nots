<%@ page import="com.moviebooking.model.User" %>

<%
    User user = (User) session.getAttribute("user");

    if(user != null){

        if(user.getRole().equalsIgnoreCase("ADMIN")){
            response.sendRedirect("adminDashboard.jsp");
            return;
        }else{
            response.sendRedirect("userDashboard.jsp");
            return;
        }
    }
%>

<!DOCTYPE html>
<html>
<head>
    <title>Movie Booking System</title>

    <style>

        *{
            margin:0;
            padding:0;
            box-sizing:border-box;
            font-family:'Segoe UI',sans-serif;
        }

        body{
            height:100vh;
            display:flex;
            justify-content:center;
            align-items:center;
            background:linear-gradient(
                    rgba(0,0,0,0.7),
                    rgba(0,0,0,0.7)
            ),
            url('https://images.unsplash.com/photo-1489599849927-2ee91cede3ba');
            background-size:cover;
            background-position:center;
        }

        .container{
            text-align:center;
            color:white;
            background:rgba(255,255,255,0.08);
            backdrop-filter:blur(15px);
            padding:50px;
            border-radius:20px;
            box-shadow:0 8px 32px rgba(0,0,0,0.5);
        }

        h1{
            font-size:50px;
            margin-bottom:15px;
        }

        p{
            font-size:18px;
            color:#ddd;
            margin-bottom:35px;
        }

        .btn-group{
            display:flex;
            justify-content:center;
            gap:20px;
            flex-wrap:wrap;
        }

        .btn{
            text-decoration:none;
            padding:15px 35px;
            border-radius:10px;
            color:white;
            font-size:18px;
            font-weight:bold;
            transition:0.3s;
        }

        .login{
            background:#007bff;
        }

        .register{
            background:#28a745;
        }

        .btn:hover{
            transform:scale(1.08);
        }

        @media(max-width:600px){

            h1{
                font-size:35px;
            }

            .container{
                width:90%;
                padding:30px;
            }

        }

    </style>

</head>

<body>

<div class="container">

    <h1>🎬 Movie Booking System</h1>

    <p>
        Book Your Favorite Movies Anytime, Anywhere
    </p>

    <div class="btn-group">

        <a href="login.jsp" class="btn login">
            🔐 Login
        </a>

        <a href="register.jsp" class="btn register">
            📝 Register
        </a>

    </div>

</div>

</body>
</html>
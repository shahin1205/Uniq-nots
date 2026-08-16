<%--
  Created by IntelliJ IDEA.
  User: shahin
  Date: 6/14/2026
  Time: 4:26 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
    <title>Login</title>

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
            background:linear-gradient(135deg,#141E30,#243B55);
        }

        .container{
            width:400px;
            background:rgba(255,255,255,0.1);
            backdrop-filter:blur(15px);
            padding:40px;
            border-radius:20px;
            box-shadow:0 8px 32px rgba(0,0,0,0.4);
            text-align:center;
            color:white;
        }

        .container h2{
            margin-bottom:25px;
            font-size:32px;
        }

        .input-box{
            width:100%;
            margin:15px 0;
        }

        .input-box input{
            width:100%;
            padding:14px;
            border:none;
            border-radius:10px;
            outline:none;
            font-size:16px;
        }

        .login-btn{
            width:100%;
            padding:14px;
            margin-top:20px;
            border:none;
            border-radius:10px;
            background:#00C9A7;
            color:white;
            font-size:18px;
            font-weight:bold;
            cursor:pointer;
            transition:0.3s;
        }

        .login-btn:hover{
            background:#00A98D;
            transform:scale(1.03);
        }

        .register{
            margin-top:20px;
        }

        .register a{
            color:#00C9A7;
            text-decoration:none;
            font-weight:bold;
        }

        .register a:hover{
            text-decoration:underline;
        }

        @media(max-width:500px){

            .container{
                width:90%;
                padding:25px;
            }

            .container h2{
                font-size:26px;
            }
        }

    </style>

</head>
<body>

<div class="container">

    <h2>🎬 Movie Booking Login</h2>

    <form action="login" method="post">

        <div class="input-box">
            <input type="email"
                   name="email"
                   placeholder="Enter Email"
                   required>
        </div>

        <div class="input-box">
            <input type="password"
                   name="password"
                   placeholder="Enter Password"
                   required>
        </div>

        <button type="submit" class="login-btn">
            Login
        </button>

    </form>

    <div class="register">
        Don't have an account?
        <br><br>
        <a href="register.jsp">Register Here</a>
    </div>

</div>

</body>
</html>
<%--
  Created by IntelliJ IDEA.
  User: shahin
  Date: 6/14/2026
  Time: 1:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<!DOCTYPE html>
<html>
<head>
  <title>Register</title>

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
      background:linear-gradient(135deg,#0f2027,#203a43,#2c5364);
    }

    .container{
      width:420px;
      background:rgba(255,255,255,0.1);
      backdrop-filter:blur(15px);
      padding:35px;
      border-radius:20px;
      box-shadow:0 8px 32px rgba(0,0,0,0.4);
      color:white;
    }

    .container h2{
      text-align:center;
      margin-bottom:25px;
      font-size:32px;
    }

    .input-group{
      margin-bottom:18px;
    }

    .input-group label{
      display:block;
      margin-bottom:8px;
      font-weight:600;
    }

    .input-group input,
    .input-group select{
      width:100%;
      padding:12px;
      border:none;
      border-radius:10px;
      outline:none;
      font-size:15px;
    }

    .register-btn{
      width:100%;
      padding:14px;
      border:none;
      border-radius:10px;
      background:#00C9A7;
      color:white;
      font-size:18px;
      font-weight:bold;
      cursor:pointer;
      transition:0.3s;
    }

    .register-btn:hover{
      background:#00a98d;
      transform:scale(1.03);
    }

    .login-link{
      text-align:center;
      margin-top:20px;
    }

    .login-link a{
      color:#00C9A7;
      text-decoration:none;
      font-weight:bold;
    }

    .login-link a:hover{
      text-decoration:underline;
    }

    @media(max-width:500px){
      .container{
        width:90%;
      }
    }

  </style>
</head>

<body>

<div class="container">

  <h2>🎬 Register</h2>

  <form action="register" method="post">

    <div class="input-group">
      <label>Name</label>
      <input type="text"
             name="name"
             placeholder="Enter your name"
             required>
    </div>

    <div class="input-group">
      <label>Email</label>
      <input type="email"
             name="email"
             placeholder="Enter your email"
             required>
    </div>

    <div class="input-group">
      <label>Password</label>
      <input type="password"
             name="password"
             placeholder="Enter your password"
             required>
    </div>

    <div class="input-group">
      <label>Role</label>
      <select name="role">

        <option value="USER">
          User
        </option>

        <option value="ADMIN">
          Admin
        </option>

      </select>
    </div>

    <button type="submit" class="register-btn">
      Register
    </button>

  </form>

  <div class="login-link">
    Already have an account?
    <br><br>
    <a href="login.jsp">Login Here</a>
  </div>

</div>

</body>
</html>
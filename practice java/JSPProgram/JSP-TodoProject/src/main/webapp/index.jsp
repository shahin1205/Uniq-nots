<html>
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
        background:linear-gradient(135deg,#667eea,#764ba2);
    }

    .container{
        background:white;
        padding:50px;
        border-radius:20px;
        text-align:center;
        box-shadow:0 10px 30px rgba(0,0,0,0.2);
        width:400px;
    }

    h1{
        color:#333;
        margin-bottom:30px;
    }

    form{
        margin:15px 0;
    }

    button{
        width:100%;
        padding:15px;
        border:none;
        border-radius:10px;
        font-size:18px;
        font-weight:bold;
        cursor:pointer;
        transition:0.3s;
    }

    .add-btn{
        background:#10b981;
        color:white;
    }

    .add-btn:hover{
        background:#059669;
        transform:translateY(-3px);
    }

    .view-btn{
        background:#4f46e5;
        color:white;
    }

    .view-btn:hover{
        background:#3730a3;
        transform:translateY(-3px);
    }
</style>

<body>
<div class="container">

    <h1>Task Management System</h1>

    <form action="addProduct.jsp" method="post">
        <button class="add-btn" type="submit">
            ➕ Add Task
        </button>
    </form>

    <form action="view" method="post">
        <button class="view-btn" type="submit">
            📋 View Tasks
        </button>
    </form>

</div>

</body>
</html>

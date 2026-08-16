<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: shahin
  Date: 6/11/2026
  Time: 4:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--<% for(int i=0;i<=10;i++) { %>--%>
<%--<p><%=i%> *5 = <%=i*5%> </p>--%>
<%--<%}%>--%>

<% ArrayList<String> names=(ArrayList<String>) request.getAttribute("name"); %>
<% for(String name:names) { %>
<p><%=name%></p>
<%}%>
</body>
</html>

<%@ page pageEncoding="utf-8" contentType="text/html; charset=utf-8" %>
<html>
<title>Login</title>
<body>
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");

    if (username == null && password == null) {
%>
<form action="index.jsp" method="post">
    <input type="text" name="username" placeholder="username">
    <input type="password" name="password" placeholder="password">
    <input type="submit" value="Login">
</form>
<%
    }else if (username != null && username.equals("hello") && password != null && password.equals("world")) {

        out.println("Welcome!");
    } else {
        out.println("Sorry, wrong username or password");
    }
%>
</body>
</html>
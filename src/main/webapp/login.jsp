<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% if (request.getMethod().equalsIgnoreCase("post")){
    String uname = request.getParameter("username");
    String passw = request.getParameter("password");
    if (uname.equalsIgnoreCase("admin") && (passw.equalsIgnoreCase("password"))) {
        response.sendRedirect("/profile");
    }
}%>
<html>
<head>
    <title>Login</title>
</head>
<body>

    <form method="POST" action="login.jsp">
        <label>Username:</label>
        <input type="text" placeholder="login" name="username">
        <label>Password:</label>
        <input type="password" placeholder="password" name="password">
        <input type="submit">
    </form>
</body>
</html>

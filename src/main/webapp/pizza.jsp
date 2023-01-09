<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Pizza Order</title>
</head>
<body>
  <form method="POST" action="pizza-order">
      <label for="top1">Topping #1</label>
      <input type="text" placeholder="topping" id="top1" name="top1">
      <label for="top2">Topping #2</label>
      <input type="text" placeholder="topping" id="top2" name="top2">
      <input type="submit">
      <h1>Topping #1 ${top1Val}.</h1>
      <h1>Topping #2 ${top2Val}.</h1>
  </form>
</body>
</html>

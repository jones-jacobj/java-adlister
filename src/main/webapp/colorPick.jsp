<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Color Picker</title>
    <form method="POST" action="color-pick">
      <label for="color">Color</label>
      <input type="text" id="color" name="color" placeholder="FavoriteColor">
      <input type="submit">
    </form>
    <p>Desired Background= ${background}</p>
</head>
<style>
  .html{
    "background-color":${background};
  }
</style>
<body>

</body>
</html>


<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>product details</title>
</head>
<body>
<form action="addProduct.jsp" method="get">
<label>product ID :</label>
<input type="number"name="pid"><br>
<label>productname :</label>
<input type="text"name="pname"><br>
<label>productprice :</label>
<input type="number"name="price"><br>
<br>
<input type="submit"value="submit">
<input type="reset"value="reset">
</form>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>admin strana</title>
</head>
<body>
	<h1>Dobrodosli Admin!</h1>
	
	<form action="../dodajProizvodServlet" method="get">
		<input type="text" placeholder="name" name="productName" ><br>
		<input type="text" placeholder="price" name="productPrice" ><br>
		<input type="text" placeholder="stock" name="productStock" ><br>
		<input type="text" placeholder="discount" name="productDiscount" ><br>
		<input type="submit" value="dodaj proizvod">
	</form>
</body>
</html>
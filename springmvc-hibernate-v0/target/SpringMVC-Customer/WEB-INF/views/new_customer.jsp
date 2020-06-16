<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
	"http://www.w3.org/TR/html4/loose.dtd">
	
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Customer</title>
</head>
<body>
	<div align="center">
		<h2>New Customer</h2>
		<form action="save" method="post" modelAttribute="customer">
			<body>
				<table>
					<tr>
						<th>Firstname</th>
						<th><input type="text" name="name"></th>
					</tr>

					<tr>
						<th>Email</th>
						<th><input type="email" name="email"></th>
					</tr>
					<tr>
						<th>Address</th>
						<th><input type="text" name="address"></th>
					</tr>
					<td colspan="2"><input type="submit" value="Save"></td>
				</table>  
		</form>
	</div>
</body>
</html>

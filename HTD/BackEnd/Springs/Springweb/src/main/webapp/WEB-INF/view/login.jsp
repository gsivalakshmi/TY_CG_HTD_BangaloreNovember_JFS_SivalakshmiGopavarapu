<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page session="false"%>

<html>
<body>
<h2>${msg }</h2>
	<h1>Login details!!!!!!!!!!</h1>
	<form action="./login" method="post">
		<table>
			<tr>
				<td>Email:</td>
				<td><input type="text" name="email"></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password"></td>
			</tr>
			<tr>
				<td><input type="submit" name="Login"></td>
			</tr>
		</table>

	</form>
	<a href="./register">Register Here</a>
</body>
</html>
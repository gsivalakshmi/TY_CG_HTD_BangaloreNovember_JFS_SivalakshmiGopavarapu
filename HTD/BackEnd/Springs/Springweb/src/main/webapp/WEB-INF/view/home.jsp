<%@page import="com.cg.employeespringmvc.bean.EmployeeBean"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<jsp:useBean id="bean"
	class="com.cg.employeespringmvc.bean.EmployeeBean" scope="session"></jsp:useBean>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<a href="./changepassword">change password</a>
	<a href="./logout" style="float: right;">Logout</a>

	<h1 style="color: fuchsia;">
		WELCOME!!<%=bean.getName()%></h1>

	<form action="./search" method="get">
		<table>
			<tr>
				<td>Enter key</td>
				<td><input type="text" name="key"></td>
				<td><input type="submit" value="Search"></td>
			</tr>
		</table>
	</form>
	<%
	List<EmployeeBean> list=(List<EmployeeBean>)request.getAttribute("list");
	//List<EmployeeBean> list=(List<EmployeeBean>)request.getAttribute("list");
	%>
	<%
	if(list!=null){
	%>
	<%
	if(list.isEmpty()){
	%>
	<h3>No Data found...!!Sorry!</h3>
	<%
	   }else {
	%>
	<!-- -TO Task -->
	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Email</th>
		</tr>
		<%for(EmployeeBean bean2 : list){ %>
		<tr>
		<td><%=bean2.getId() %></td>
		<td><%=bean2.getName() %></td>
		<td><%=bean2.getEmail() %></td>
		</tr>
		<%} %>
	</table>
	<%
	   }
	%>
	<%
	}
	%>
</body>
</html>
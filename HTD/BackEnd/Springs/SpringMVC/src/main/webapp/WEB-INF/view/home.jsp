<jsp:useBean id="user" class="com.cg.springmvc.bean.User" 
scope="session"></jsp:useBean>
<html>
<body>
<h1 style="color: green;">Welcome.....<%=user.getName() %></h1>
</body>
</html>
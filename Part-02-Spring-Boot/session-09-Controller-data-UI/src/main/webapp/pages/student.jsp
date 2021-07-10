<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome Student Login</h1>

<f:form action="save" modelAttribute="student" method="post">

User Name     :  <f:input path="userName" type="text"/><br>
Password      :  <f:input path="password" type="password"/><br>

<input type="submit" value="save">

</f:form>

</body>
</html>
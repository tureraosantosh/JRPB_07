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

<f:form action="save" modelAttribute="student" method="post">
	<table border="5">

		<tr>
			<td>User Name</td>
			<td><f:input path="userName" type="text" /></td>
		</tr>
		<tr>
			<td>Password</td>
			<td><f:input path="userName" type="password" /></td>
		</tr>
		<tr>
			<td><input type="submit" value="save"></input></td>
		</tr>

	</table>
	</f:form>

</body>
</html>
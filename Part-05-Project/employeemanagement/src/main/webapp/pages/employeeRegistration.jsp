<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="s"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Employee Registration</h1>
	<s:form action="registration" modelAttribute="employeeRegistration"
		method="post">
		<table>
			<tr>
				<td>First Name :</td>
				<td><s:input path="firstName" type="text" /></td>
			</tr>
			<tr>
				<td>Last Name :</td>
				<td><s:input path="lastName" type="text" /></td>
			</tr>

			<tr>
				<td>Email :</td>
				<td><s:input path="email" type="email" /></td>

			</tr>
			<tr>
				<td><input type="submit" value="register" /></td>
				<td></td>
			</tr>

		</table>
	</s:form>
</body>
</html>
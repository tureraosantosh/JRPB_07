<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="p"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>View All Employees</h1>


	<a href="empreg"> Add New Employee</a>
	<br>
	<br>
	<table border="2">

		<thead>
			<tr>

				<th>first Name</th>
				<th>Last Name</th>
				<th>email</th>
				<th>Action</th>
			</tr>
		</thead>
		<p:forEach items="${employees}" var="k">

			<tbody>
				<tr>
					<td>${k.firstName }</td>
					<td>${k.lastName }</td>
					<td>${k.email }</td>
					<td><a href="">Edit</a> | <a href="">Delete </a></td>
				</tr>
			</tbody>
		</p:forEach>
	</table>




</body>
</html>
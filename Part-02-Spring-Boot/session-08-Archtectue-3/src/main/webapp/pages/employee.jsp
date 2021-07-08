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
<h1>${title}</h1>

<table border="5">

<tr>
<td>User Name </td>
<td><f:input path=""/></td>
</tr>
<tr>
<td>Password </td>
<td><f:input path=""/></td>
</tr>
<tr>
<td><f:button></f:button></td>
</tr>

</table>

</body>
</html>
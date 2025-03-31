<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>List User</title>
</head>
<body>

<a href="newuser">Add User</a><br>
<a href="searchuser">Search User</a><br>


<br>
	<table border="1">
		<tr>
			<th>FirstName</th>
			<th>Email</th>
			<th>Action</th>
		</tr>

		<c:forEach items="${allUser}" var="u">
			<tr>
				<td>${u.firstName }</td>
				<td>${u.email }</td>
				<td><a href="deleteuser?userId=${u.userId}">Delete</a>
					|
					<a href="viewuser?userId=${u.userId}">View</a>|
					<a href="edituser?userId=${u.userId}">Edit</a>
				</td>
			</tr>
		</c:forEach>

	</table>

</body>
</html>
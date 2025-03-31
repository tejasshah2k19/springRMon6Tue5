<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

</head>
<body>
<form method="post" action="edituser">
		FirstName : <input type="text" name="firstName" value="${user.firstName}"><br><br> 
		Email : <input type="text" name="email" value="${user.email}"><br><br>
		<input type="hidden" name="userId" value="${user.userId }"/>

		<input type="submit" value="Update User"/>
	</form>
</body>
</html>
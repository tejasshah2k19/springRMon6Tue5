<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="saveuser" enctype="multipart/form-data">
		FirstName : <input type="text" name="firstName"><br><br> 
		Email : <input type="text" name="email"><br><br>
		Password : <input type="text" name="password"><br><br>
		ProfilePic: <input type="file" name="profilePic"/><br><br> 
		<input type="submit" value="Save User"/>
	</form>
</body>
</html>
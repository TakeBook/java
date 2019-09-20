<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>用户注册</title>
</head>
<body>
	<h1>用户注册</h1>
	<form method="post" action="handle_reg.do">
		用户名:	<br/>
		<input type="text" name="username"></input> <br/>
		密码:	<br/>
		<input type="text" name="password"></input> <br/>
		年龄		<br/>
		<input type="text" name="age"></input> <br/>
		手机号码:	<br/>
		<input type="text" name="phone"></input> <br/>
		电子邮箱:	<br/>
		<input type="text" name="email"></input> <br/>
		<input type="submit" value="注册"></input> <br/>
	</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Logowanie</title>
</head>
<body>
<form action="/PortfolioMK/LoginServlet.do" method="post" >
<label>Login: </label>
<input type="text" name="login" />
<label>Hasło: </label>
<input type="password" name="password" />
<input type="submit" value="Zaloguj" /> 
</form>
</body>
</html>
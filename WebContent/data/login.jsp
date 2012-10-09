<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Logowanie</title>
</head>
<body>
<form class="form-horizontal" action="/LoginServlet.do" method="post">
<div class="row-fluid">
<div class="offset3">
<legend>Logowanie</legend>
  <div class="control-group">
    <label class="control-label" for="login">Login</label>
    <div class="controls">
      <input type="text" id="login" placeholder="Login name">
    </div>
  </div>
  <div class="control-group">
    <label class="control-label" for="password">Password</label>
    <div class="controls">
      <input type="password" id="password" placeholder="Password">
    </div>
  </div>
  <div class="control-group">
    <div class="controls">
      <label class="checkbox">
        <input type="checkbox"> Loguj automatycznie
      </label>
      <button type="submit" class="btn">Zaloguj</button>
    </div>
  </div>
  </div>
  </div>
</form>

</body>
</html>
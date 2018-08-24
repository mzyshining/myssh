<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login page</title>
</head>
<body>
    <h1>员工管理系统</h1>

    <form action="login" method="post">
      <table>
      <tr><td>id:</td><td><input type="text" name="name"/></td></tr>
      <tr><td>pw:</td><td><input type="password" name="pwd"/></td></tr>
     </table>
     <input type="submit" value="登录"/>
     <input type="reset" value="重置"/>
    </form>
</body>
</html>

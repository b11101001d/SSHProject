<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<center>
	<h1>所有用户信息</h1>
	<table align="center" cellpadding="0" cellspacing="0" border="1px solid #000" width="300px">
	<tr>
				<td>姓名</td>
				<td>密码</td>
			</tr>
	<c:forEach items="${list}" var="user">
			<tr>
				<td>${user.name }</td>
				<td>${user.pwd }</td>
			</tr>
	</c:forEach>
	</table>
</center>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户列表</title>
</head>
<body> 
用户列表：
<table width="100%" border=1>
<tr>
	<td>user_id</td>
	<td>user_name</td>
	<td>password</td>
	<td>gender</td>
	<td>number</td>
</tr>
<c:forEach items="${userList }" var="item">
<tr>
	<td>${item.userId }</td>
	<td>${item.userName }</td>
	<td>${item.password }</td>
	<td>${item.gender }</td>
	<td>${item.number }</td>

</tr>
</c:forEach>

</table>
</body>

</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登陆成功页面</title>
</head>
<body>
	<div align="center">
		<c:if test="${sessionScope.user==null}">
			<h3>欢迎游客,请<a href="login">登录</a></h3>
		</c:if>
		<c:if test="${sessionScope.user!=null}">
			<h3>欢迎【${sessionScope.user.username}】登录</h3>
		</c:if>
		<table width="80%" border=1>
			<tr>
				<td>用户ID</td>
				<td>用户名称</td>
				<td>用户密码</td>
				<td>角色ID</td>
				<td>用户状态</td>
			</tr>
	<c:forEach items="${users }" var="user">
			<tr>
				<td>${user.id }</td>
				<td>${user.username }</td>
				<td>${user.password }</td>
				<td>${user.roleId }</td>
				<td>${user.status }</td>
			</tr>
	</c:forEach>
		</table>
	</div>
</body>
</html>
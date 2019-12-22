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
		<hr color="red">
		<table  border=1>
			<tr>
				<th>用户ID</th>
				<th>用户名称</th>
				<th>用户密码</th>
				<th>角色名称</td>
				<th>用户状态</th>
				<th>操作</th>
			</tr>
	<c:forEach items="${users }" var="user">
			<tr>
				<td>${user.id }</td>
				<td>${user.username }</td>
				<td>${user.password }</td>
				<td>${user.role.name }</td>
				<td>${user.status }</td>
				<td><a href="">查看</a>
					<a href="">编辑</a>
					<a href="">删除</a></td>
			</tr>
	</c:forEach>
		</table>
	</div>
</body>
</html>
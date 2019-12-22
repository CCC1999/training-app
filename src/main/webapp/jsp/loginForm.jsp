<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>登陆页面</title>
</head>
<body>
	<div align="center">
	<h3>登陆页面</h3>
	<hr color="red">
	<form:form  modelAttribute="user" method="post" action="login">
		<table>
			<tr>
				<td>登录名：</td>
				<td><form:input path="username" /></td>
			</tr>
			<tr>
				<td>密码：</td>
				<td><form:input  path="password" type="password"/></td>
			</tr>
			<c:if test="${msg!=null}">
			<tr>
				<td colspan="2"><div style="color:#F00">${msg}</div> </td>
			</tr>
			</c:if>
			<tr>
				<td><input type="submit" value="登录"/></td>
				</form:form>
				<form:form  method="post" action="register">
				<td><input type="submit" value="注册"/></td>
				</form:form>
			</tr>
		</table>
	
	</div>
</body>
</html>
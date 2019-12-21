<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<script>
	function Return()
	{
		window.location.href="login";
	}
</script>
<meta charset="UTF-8">
<title>注册页面</title>
</head>
<body>
	<div align="center">
	<form:form  modelAttribute="u" action="handle" method="post">
		<table>
			<tr>
				<td><label>用户名：</label></td>
				<td><input type="text" id="username" name="username" value=${u.username }></td>
				<td><form:errors path="username" cssStyle="color:red"/></td>
			</tr>
			<tr>
				<td><label>密码：</label></td>
				<td><input type="password" id="password" name="password" ></td>
				<td><form:errors path="password" cssStyle="color:red"/></td>
			</tr>
			<tr>
				<td><label>角色ID：</label></td>
				<td><input type="number" id="roleId" name="roleId" value="${u.roleId }"></td>
				<td><form:errors path="roleId" cssStyle="color:red"/></td>
			</tr>
			<tr>
				<td><label>角色状态：</label></td>
				<td><input type="number" id="status" name="status" value="${u.status }"></td>
				<td><form:errors path="status" cssStyle="color:red"/></td>
			</tr>
			<tr>
				<td><input type="submit" id="submit" value="注册"></td>
	</form:form>
				<td><button type="button" onclick="Return()" >返回</button></td>
			</tr>
		</table>
	</div>
</body>
</html>
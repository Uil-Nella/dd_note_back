<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<style type="text/css">
table,td {
	font: 100% Arial, Helvetica, sans-serif;
	font-size: 14px;
}

.dd table {
	border-collapse: collapse;
	border: none;
}

.dd td {
	border: solid gray 1px;
	height: 25px;
	text-align: center;
}
</style>


</head>
<body>
	<form action="/Demo5/gl/add">
		<table>
			<tr>
				<td>username:</td>
				<td><input type="text" name="userName" /></td>
			</tr>

			<tr>
				<td>password:</td>
				<td><input type="text" name="password" /></td>
			</tr>

			<tr>
				<td><input type="submit" value="submit" /></td>
				<td><input type="reset" value="reset" /></td>
			</tr>
		</table>
	</form>
	<br>
	<div class="dd">
		<table width="100%">
			<tr>
				<td width="30%">ID</td>
				<td width="10%">name</td>
				<td width="10%">password</td>
				<td width="30%">code</td>
			</tr>

			<c:forEach items="${users}" var="user">
				<tr>
					<td><c:out value="${user.code}" /></td>
					<td><c:out value="${user.name}" /></td>
					<td><c:out value="${user.password}" /></td>
					<td><a href="/Demo5/gl/detail?id=${user.id}">detail</a> <a
						href="/Demo5/gl/toupdate?id=${user.id}">update</a> <a
						href="/Demo5/gl/delete?id=${user.id}">delete</a></td>
				</tr>
			</c:forEach>

		</table>
	</div>
</body>
</html>
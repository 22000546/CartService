<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Your Cart</title>
<link href="${pageContext.request.contextPath}/resources/css/login.css"
	rel="stylesheet" type="text/css">
</head>
<body>
	<div class="name">
		<h3>한 번에 쉽고 빠르게 관리하는</h3>
		<h1>Your Cart</h1>
	</div>
	<div class="main">
		<form method="post" action="loginOk">
			<table>
			<tr>
				<td><input type='text' name='userid' placeholder="ID" /></td>
				<td id="button"><button type='submit'>LOG IN</button></td>
			</tr>
			<tr>
				<td><input type='password' name='password' placeholder="PASSWORD" /></td>
			</tr>
			
			</table>
		</form>
	</div>

</body>
</html>
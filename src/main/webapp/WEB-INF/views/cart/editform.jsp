<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Your Cart</title>
<link href="${pageContext.request.contextPath}/resources/css/main.css"
	rel="stylesheet" type="text/css">
</head>
<body>

	<div class="top">
		<h1 class="top">Your Cart</h1>
	</div>
	<div class="main">
		<h2 class="main">상품 정보 수정</h2>
		<div class="board">
			<form:form commandName="cartVO" action="../editok" method="post">
				<form:hidden path="seq" />
				<table id="edit">
					<tr id="line1">
						<td>상품 이름</td>
						<td><form:input path="itemname" /></td>
						
						<td><button type="button">이미지 업로드</button></td>
						<td></td>

						<td>가격</td>
						<td><form:input path="price" /></td>
					</tr>

					<tr id="line2">
						<td>URL</td>
						<td><form:input path="url" /></td>

						<td></td>
						<td></td>

						<td>해시태그</td>
						<td><form:textarea path="hashtag" cols="40%" rows="5" /></td>
					</tr>
				</table>
				<div class="buttons">
					<input type="submit" value="수정하기" style="width: 100px; height: 40px;"/>
					<input type="button" value="취소하기" style="width: 100px; height: 40px;" onclick="history.back()"/>
				</div>
				</form:form>
		</div>
	</div>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
		<h2 class="main">상품 정보 추가</h2>
		<div class="board">
			<form action="addok" method="post">
				<table id="add">
					<tr id="line1">
						<td>상품 이름</td>
						<td><input type="text" name="itemname" /></td>

						<td><button type="button">이미지 업로드</button></td>
						<td></td>

						<td>가격</td>
						<td><input type="text" name="price" /></td>
					</tr>

					<tr id="line2">
						<td>URL</td>
						<td><input type="text" name="url" /></td>

						<td></td>
						<td></td>

						<td>해시태그</td>
						<td><textarea cols="40%" rows="5" name="hashtag"></textarea></td>
					</tr>
				</table>
				<div class="buttons">
					<button type="button" onclick="location.href='list'">목록보기</button>
					<button type="submit">등록하기</button>
				</div>
			</form>
		</div>
	</div>

</body>
</html>
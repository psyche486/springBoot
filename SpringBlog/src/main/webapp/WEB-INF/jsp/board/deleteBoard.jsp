<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>글 추가 테스트</title>
</head>
<body>
Board Delete Test 
	<form name ="deleteBoard" id="deleteBoard" method="post" action="/board/delete">
		<table border="1" style="width:100px">
			<thead>
			<tr>
				<th>No.</th>
			</tr>
			</thead>
			<tbody>
				<tr>
					<td><input type="text" id="bbs_no" name="bbs_no"></td>
				</tr>
			</tbody>
		</table>
			<input type="submit" id ="delete" name="삭제하기" value="삭제하기" />
	</form>
</body>
</html>
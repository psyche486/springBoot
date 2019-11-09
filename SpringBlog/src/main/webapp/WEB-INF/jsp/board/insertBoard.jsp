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
Board Insert Test Page
	<form name ="insertBoard" id="insertBoard" method="post" action="/board/insert">
		<table border="1" style="width:500px">
			<thead>
			</thead>
			<tbody>
		<tbody>
			<tr>
				<th>No.</th>
				<td><input type="text" id="bbs_no" name="bbs_no"></td>
			</tr>
			<tr>
				<th>Title</th>
				<td><input type="text" id="bbs_title" name="bbs_title"></td>
			</tr>
				<tr>
				<th>Content</th>
				<td><input type="text" id="bbs_content" name="bbs_content"></td>
			</tr>
			</tr>
				<tr>
				<th>Writer</th>
				<td><input type="text" id="bbs_writer" name="bbs_writer"></td>
			</tr>			
		</tbody>
			</tbody>
		</table>
			<input type="submit" id="btnInsert" name="btnInsert" value="저장(INSERT)">
	</form>
</body>
</html>
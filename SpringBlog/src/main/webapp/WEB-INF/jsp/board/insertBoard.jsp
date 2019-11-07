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
Board Insert Test 
	<form name ="insertBoard" id="insertBoard" method="post" action="/board/insert">
		<table border="1" style="width:500px">
			<thead>
			<tr>
				<th>No.</th>
				<th>Title</th>
				<th>Content</th>
				<th>Writer</th>
				<th>Count</th>
			</tr>
			</thead>
			<tbody>
				<tr>
					<td><input type="text" id="bbs_no" name="bbs_no"></td>
					<td><input type="text" id="bbs_title" name="bbs_title"/></td>
					<td><input type="text" id="bbs_content" name="bbs_content"/></td>				
					<td><input type="text" id="bbs_writer" name="bbs_writer"/></td>
					<td><input type="text" id="bbs_read_count" name="bbs_read_count"/></td>
				</tr>
			</tbody>
		</table>
			<input type="submit" name="추가하기" value="추가하기" id ="insert"/>
	</form>
</body>
</html>
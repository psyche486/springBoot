<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Spring Blog</title>
</head>
<script>
</script>

<body>
Board List  
<%
List<Map<String,Object>> list = (List<Map<String,Object>>)request.getAttribute("list");
%>

<div>
	<button id="boardListAdd" onclick="location='/board/insertBoard'">글쓰기</button>
	<button id="boardListDelete" onclick="location='/board/deleteBoard'">글삭제</button>
</div>
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
		<%
			for(int i = 0 ;i < list.size();i++){
				Map<String,Object> map = list.get(i);
		%>
		<tr>
			<td><%=map.get("bbs_no") %></td>		
			<td><%=map.get("bbs_title") %></td>	
			<td><%=map.get("bbs_content") %></td>	
			<td><%=map.get("bbs_writer") %></td>		
			<td><%=map.get("bbs_read_count") %></td>		
		</tr>
		<%			
			}
		%>
	</tbody>
</table>
</body>
</html>
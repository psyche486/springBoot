<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring Blog</title>
</head>
<script>
</script>

<body>
Board List Page 
<%
List<Map<String,Object>> list = (List<Map<String,Object>>)request.getAttribute("list");
String count = request.getParameter("count");
%>

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
			<td><%= map.get("bbs_no")%></td>
			<td><a href="/board/detail?bbs_no=<%= map.get("bbs_no")%>"><%=map.get("bbs_title") %></td>	
			<td><%=map.get("bbs_content") %></td>	
			<td><%=map.get("bbs_writer") %></td>		
			<td><%=map.get("bbs_read_count") %></td>		
		</tr>
		<%			
			}
		%>
	</tbody>
</table>
<div>
	<button id="boardListInsert" onclick="location='/board/insertBoard'">새글추가(INSERT)</button>
</div>
</body>
</html>
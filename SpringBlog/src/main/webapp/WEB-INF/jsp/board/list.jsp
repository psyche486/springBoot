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
<body>
�׽�Ʈ
<%
List<Map<String,Object>> list = (List<Map<String,Object>>)request.getAttribute("list");
%>
<table border="1" style="width:500px">
	<thead>
	<tr>
		<td>��ȣ</td>
		<td>����</td>
		<td>�ۼ���</td>
		<td>��ȸ��</td>
	</tr>
	</thead>
	<tbody>
		<%
			for(int i = 0 ;i < list.size();i++){
				Map<String,Object> map = list.get(i);
		%>
		<td><%=map.get("bbs_no") %></td>		
		<td><%=map.get("bbs_title") %></td>		
		<td><%=map.get("bbs_writer") %></td>		
		<td><%=map.get("bbs_read_count") %></td>		
		<%			
			}
		%>
	</tbody>
</table>
</body>
</html>
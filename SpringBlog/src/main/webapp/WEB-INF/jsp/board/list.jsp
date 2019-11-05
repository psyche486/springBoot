<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
1122
<%
List<Map<String,String>> list = (List<Map<String,String>>)request.getAttribute("list");

for(int i = 0 ;i < list.size();i++){
	Map<String,String> map = list.get(i);
	out.print(map+"<br/>");
}
%>
</body>
</html>
<%@page import="java.util.Map"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring Blog</title>
</head>
<body>
<script type="text/javascript">
function btnAction(mode){
	alert("::mode::="+mode);
	var theForm = document.formDetailBoard;
	
	if(mode == "update")
	{
	theForm.method = "post";
	theForm.target = "_self";
	 theForm.action = "/board/update";
	}
	else if(mode == "delete")
	{
	  theForm.method = "post";
	  theForm.target = "_self";
	  theForm.action = "/board/delete";
	}
	theForm.submit();
}
</script>
Board Detail Page  
<%
Map<String,Object> result = (Map<String,Object>)request.getAttribute("result");
%>

<form name ="formDetailBoard" id="formDetailBoard">
	<table border="1" style="width:500px">
		<thead>
		</thead>
		<tbody>
			<tr>
				<th>No.</th>
				<td><input type="text" id="bbs_no" name="bbs_no" value="<%= result.get("bbs_no")%>"></td>
			</tr>
			<tr>
				<th>Title</th>
				<td><input type="text" id="bbs_title" name="bbs_title" value="<%= result.get("bbs_title")%>"></td>
			</tr>
				<tr>
				<th>Content</th>
				<td><input type="text" id="bbs_content" name="bbs_content" value="<%= result.get("bbs_content")%>"></td>
			</tr>		
			</tr>
				<tr>
				<th>Writer</th>
				<td><input type="text" id="bbs_writer" name="bbs_writer" value="<%= result.get("bbs_writer")%>"></td>
			</tr>
		</tbody>
	</table>
	<div>
		<input type="button" id="btnUpdate" name ="btnUpdate" onclick ="btnAction('update')" value ="글수정(UPDATE)">
		<input type="button" id="btnDelete" name ="btnDelete" onclick ="btnAction('delete')" value ="글삭제(DELETE)">
		<input type="button" id="btnBack" name ="btnBack" onclick="location='/board/boardList'" value="뒤로가기">
	</div>
</form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
      <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     <link href="<%=request.getContextPath()%>/css/index3.css" rel="stylesheet">

    <script type="text/javascript"  src="<%=request.getContextPath() %>/js/jquery-3.2.1.js"></script>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<script type="text/javascript">
	function add(){
		location.href="add.jsp";
	}
	function del(id){
		$.post(
				"del.do",
				{id:id},
				function(s){
					if(s){
						alert("操作成功")			
						location.href="list.do";
					}else{
						alert("操作失败");
					}
					
						
					
				},
				"json"
			
			)
	}
	function update(id){
		location.href="update.jsp?id="+id;
		
	}
	function update1(id){
		location.href="update1.jsp?id="+id;
		
	}
</script>
<body>
<form action="list.do" method="post">
	<input type = "text" name = "name" value = "${name }">
	<input type = "submit"  value = "搜索">
	
</form>
<table>
	<tr>
		<td>ID</td>
		<td>name</td>
		<td>card</td>
		<td>age</td>
		<td>sex</td>
		<td>desc</td>
		<td>
			<input type = "button" value = "添加" onclick="add()">
			
		</td>
	</tr>
	<c:forEach items="${list }" var = "s" varStatus="count">
	<tr>
		<td>${count.count }</td>
		<td>${s.name }</td>
		<td>${s.card }</td>
		<td>${s.age }</td>
		<td>${s.sex }</td>
		<td>${s.descs }</td>
		<td>
			<input type = "button" value = "删除" onclick="del(${s.id})">
			<input type = "button" value = "修改" onclick="update(${s.id})">
			<input type = "button" value = "详细表述" onclick="update1(${s.id})">
		</td>
	</tr>	
	</c:forEach>
	<tr>
		<td colspan="10">
			${fenye}
		</td>
	</tr>
</table>
</body>
</html>
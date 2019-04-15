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
		$.post(
			"add.do",
			$("form").serialize(),
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
	
</script>
<body>
	<form action="">
		name；<input type = "text" name = "name"><br><br>
		card；<input type = "text" name = "card"><br><br>
		age；<input type = "text" name = "age"><br><br>
		sex；<input type = "text" name = "sex"><br><br>
		desc；<input type = "text" name = "descs"><br><br>
		<input type = "button" value = "添加" onclick="add()"><br><br>
	
	</form>
</body>
</html>
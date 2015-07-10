<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% String path = request.getContextPath(); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index</title>
</head>
<body>

<form action="<%= path%>/front/login" >
id:&nbsp&nbsp<input type="text" name="id"/><br/>
密码:<input type="text" name="pwd"/><br/>
<input type="submit" value="提交" />
<span id="msg"></span>
</form>

<script type="text/javascript">
Window.onload=function(){
		if(${flag == false}){
			document.getElementById('msg').innerHTML="error";
		}
}
</script>
</body>
</html>

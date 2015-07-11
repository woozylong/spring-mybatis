<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<% String path = request.getContextPath(); %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>index</title>
<script type="text/javascript">
window.onload=function(){
		if(!<%= request.getParameter("flag")%>){
			document.getElementById('msg').innerHTML="<font color='#FF0000'>账号密码不正确</font>";
		}
}
</script>
</head>
<body>

<form action="<%= path%>/front/login" >
id:&nbsp&nbsp<input type="text" name="id"/><br/>
密码:<input type="text" name="pwd"/><br/>
<input type="submit" value="提交" />
<span id="msg"></span>
</form>
</body>
</html>

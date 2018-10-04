<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<h1>쿠키 예제</h1>
	<h3>Request Cookies:</h3>
	<% //Scriptlet: 자바코드 영역을 선언하는 방법 %>
	<%
	int count = (int)request.getAttribute("count");
	
	Cookie[] requestCookies = request.getCookies();
	
	for (Cookie c : requestCookies) {
		 out.write("Name=" + c.getName() + ", Value=" + c.getValue()
		 + ", Comment=" + c.getComment() + ", Domain="
		 + c.getDomain() + ", MaxAge=" + c.getMaxAge()
		 + ", Path=" + c.getPath() + ", Version="
		 + c.getVersion());
		 out.write("<br>");
	}
	
	out.write("Cookie Write OK..." + count);
	%>

</body>
</html>
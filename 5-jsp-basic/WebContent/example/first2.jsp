<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>loopcount :<%=request.getParameter("loopcount")%></p>
	<p>
		<%
			int loopcount = Integer.parseInt(request.getParameter("loopcount"));
			for (int i = 0; i < loopcount; i++) {
				out.println("Hello… <br>");
			}
		%>
	</p>
</body>
</html>
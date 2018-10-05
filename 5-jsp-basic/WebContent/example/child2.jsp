<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>child 2!</h2>
	<h3>${title }</h3>
	<!-- 부모 페이지의 지역변수 subject를 사용할 수 없습니다.  -->
	<%-- <h4><%=subject %></h4> --%>
	<p><%=request.getParameter("this is key") %></p>
</body>
</html>
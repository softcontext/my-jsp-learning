<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isErrorPage="true"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
	String message = "";

	if (exception instanceof ArithmeticException) {
		message = "산술연산 오류";
	} else {
		message = "오류가 발생했습니다. 잠시 후 다시 시도해 주세요.";
	}
%>
	<h2><%=message%></h2>
</body>
</html>
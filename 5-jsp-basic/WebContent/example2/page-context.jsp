<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>pageContext 객체를 이용한 예제</h3>
<%
	//아래의 경우에는 에러난다. 같은 문맥이 아니므로...
	//pageContext.forward("http://www.daum.net");
	//다음과 같은 경우엔 가능하다.
	// 주의: forward 방식은 URL 주소가 변경되지 않습니다.
	pageContext.forward("first.jsp");
%>
</body>
</html>
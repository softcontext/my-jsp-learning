<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="com.example.vo.User"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title></title>
</head>
<body>
	<form method="post">
		Tel: <input type="text" name="tel" size="40">
		<input type="submit" value="Send">
	</form>
	<hr>
	<%-- ${param.tel } --%>
	<!-- 
		IE 로 테스트하세요.
		<script>alert('Hacking...');</script>
		무한반복 > 청와대 사이트를 0.1 초마다 접속을 시도합니다.
		국정원이 여러분을 방문할 듯...
	 -->
	 
	<!-- 사용자로부터 받은 문자열을 그대로 사용할 때는 
	반드시 Escape 한 다음에 사용합니다. -->
	<c:out value="${param.tel}"></c:out>
	<!-- 
		&lt;script&gt;alert(&#039;Hacking...&#039;);&lt;/script&gt;
	 -->
	
</body>
</html>




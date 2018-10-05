<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	div {
		border: 1px solid black;
		padding: 10px;
		margin: 10px 0px;
	}
</style>
</head>
<body>
	<h1>parent</h1>
	<%
		request.setAttribute("title", "This is Title");
		String subject = "XX";
	%>
	<!-- 
		참고자료: 읽어보세요.
		https://stackoverflow.com/questions/16593952/java-variable-across-multiple-include-blocks-variable-cannot-be-resolved
	 -->
	<div>
		<%@ include file="child.jspf" %>
	</div>
	<!-- 
		참고자료: 읽어보세요.
		http://www.java67.com/2016/01/6-difference-between-include-directive-and-include-action-in-jsp.html
		http://devyongsik.tistory.com/92
	 -->
	<div>
		<!-- 부모 페이지의 지역변수 subject를 직접 넘겨주면 자식 페이지에서 사용할 수 있습니다.  -->
		<jsp:include page="child2.jsp">
			<jsp:param value="<%=subject %>" name="this is key"/>
		</jsp:include>
	</div>
</body>
</html>
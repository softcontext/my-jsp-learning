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
<!-- 이 페이지를 다운로드 받을 때 사용한 URL
	http://localhost:8080/5-jsp-basic/example7/p164.jsp
 -->
<body>
	<!-- http://localhost:8080/5-jsp-basic/example7/first.jsp -->
	1: <a href="first.jsp">URL의 p164.jsp 문자열만 바꾸어서 사용 함</a><br>
	
	<!-- http://localhost:8080/5-jsp-basic/example7/first.jsp -->
	2: <a href="${pageContext.request.contextPath }/example7/first.jsp">프로젝트 컨텍스트를 구한다음 절대경로로 설정 함</a><br>
	
	<!-- http://localhost:8080/ -->
	3: <a href="/">Bad! 프로젝트 컨텍스트 패스가 없으므로 연동이 안 됨</a><br>
	
	<!-- http://localhost:8080/5-jsp-basic/ -->
	4: <a href="<c:url value='/' />">프로젝트 컨텍스트 패스 처리가 자동으로 됨</a><br>
	
	<!-- 상대경로 방식-->
	5: <a href="../example5/gugudan.jsp">링크를 건 파일과 연동할 타겟 파일의 상대적 위치로 설정 함</a><br>
	
	<!-- 절대경로 방식: 컨텍스트 패스가 변경되면 직접 코드를 수정해야 함-->
	6: <a href="/5-jsp-basic/example5/gugudan.jsp">Bad! 프로젝트 루트 패스부터 사용하여 설정 함</a><br>
	
	<!-- 편한 절대경로 방식: 컨텍스트 패스가 변경되어도 자동으로 반영 됨 -->
	7: <a href="<c:url value='/example5/gugudan.jsp' />">프로젝트 루트 패스부터 사용하여 설정 함</a><br>
</body>
</html>




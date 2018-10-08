<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List,java.util.ArrayList" %>  
<%@ page import="com.example.vo.User" %> 
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<%
	List<User> users = new ArrayList<User>();
	users.add(new User(1, "Tom", "Cruise", true));
	users.add(new User(2, "John", "Doe", false));
	users.add(new User(3, "Luke", "Skywalker", true));
	
	request.setAttribute("users", users);
%>
<body>

<%
	for(User user : users){
		out.print("<ul>");
		out.print("<li>"+user.getId()+"</li>");
		out.print("<li>"+user.getFirstName()+" "+user.getLastName()+"</li>");
		out.print("<li>"+user.isActive()+"</li>");
		out.print("</ul>");
	}
%>
	<hr>
	
	<!-- EL 표현식에서 객체의 멤버변수는 getter로 가져오지만 문법적인 코딩은
		멤버변수를 직접 접근하는 것처럼 설정합니다. -->
	<c:forEach var="user" items="${users }">
		<ul>
			<li>${user.id }</li>
			<li>${user["firstName"] } ${user.lastName }</li>
			<li>${user.active }</li>
		</ul>			
	</c:forEach>

</body>
</html>




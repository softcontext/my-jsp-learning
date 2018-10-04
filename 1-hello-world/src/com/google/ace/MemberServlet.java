package com.google.ace;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/members")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(
			HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// 데이터를 HTML 포맷으로 가공해서 브라우저에게 전달합니다.
		
		res.setContentType("text/html");
		PrintWriter out = res.getWriter();
		out.print("<html>");
		out.print("<body>");
		out.print("<h1>Hello World!!!</h1>");
		out.print("</body>");
		out.print("</html>");
		
		// 자바 클래스에서 HTML을 가공하는 것은 상당히 괴로운 작업입니다.
		// 그래서 서블릿 클래스를 JSP로 만드는 방법이 도입되었습니다.
	}
	
	@Override
	protected void doPost(
			HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
	}
}

package com.example.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet({ "/member-only-data" })
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String path = "/WEB-INF/views/";
				
		HttpSession session = req.getSession();
		if (session.getAttribute("loginUser") == null) {
			// 회원이 아니면 요청한 정보 대신 로그인 화면을 전달합니다.
			// redirect 를 하면 URL 주소창이 변경됩니다.
			// 1. 서블릿 클래스가 "login" 문자열을 브라우저에게 전송합니다.
			// 2. 브라우저는 받은 문자열로 URL 주소창을 변경하고 다시 접속합니다.
			// 3. "login" 문자열을 처리하는 서블릿 클래스가 접수받고
			// 연동 JSP를 호출합니다.
			res.sendRedirect("login");
		} else {
			// 회원이면 요청한 정보를 보여줍니다.
			path = path + "member-only-data.jsp";
			// forward 를 하면 URL 주소창은 변경되지 않습니다.
			req.getRequestDispatcher(path).forward(req, res);
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}
}

package com.google.ace;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//http://localhost:8080/1-hello-world/UserServlet
//http://localhost:8080/1-hello-world/users

//통신규약://서버:포트/프로젝트/클래스
//포트를 생략하면 80 포트를 적용한다.
//프로젝트를 생략하면 디폴트 프로젝트와의 연동을 의미한다.
//디폴트 프로젝트는 WAS당 하나만 설정할 수 있다.

//클래스 안에 연동할 메소드는 HTTP 프로토콜 규약에 따른
//설정된 요청방식에 따른다. 브라우저 주소창에 주소를 입력하고 접근하는 경우,
//요청방식은 GET이 된다.

@WebServlet({ "/UserServlet", "/users" })
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/*
	 * 브라우저 ==URL==> 서버 
	 *   ====> 서블릿프레임워크(프로젝트) Thread 생성 후 접근
	 *   ==HttpServletRequest==> 서블릿 클래스 # 메소드
	 *   
	 * HttpServletRequest : 브라우저가 보낸 모든 정보가 담겨 있는 객체
	 * HttpServletResponse : 서버에서 브라우저로 보내는 정보를 담는 객체
	 */
	// service 는 모든 요청방식에 대응합니다. 이 메소드가 있으면 다른 메소드는 작동하지 않습니다.
	// 실무에서 거의 사용하지 않습니다.	
//	protected void service(
//			HttpServletRequest request, HttpServletResponse response)
//			throws ServletException, IOException {
//		
//		System.out.println("service()");
//		
//		String number = request.getParameter("number");
//		System.out.println("number = " + number);
//		
//		PrintWriter out = response.getWriter();
//		out.write("Hello, I am a Server!");
//		
//	}

	// GET 요청방식: 브라우저가 서버에게 데이터를 요청할 때 사용합니다.
	protected void doGet(
			HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("doGet()");
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	// POST 요청방식: 브라우저가 서버에게 데이터를 전송할 때 사용합니다.
	protected void doPost(
			HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		System.out.println("doPost()");
		
		String number = request.getParameter("number");
		System.out.println("number = " + number);
		
		doGet(request, response);
	}

}

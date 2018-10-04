package com.google.ace;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/HelloServlet")
public class HelloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
	}
       
	// 앞서서 서블릿 프레임워크가 서블릿 클래스를 사용하여 객체를 만들고
	// 서블릿 컨테이너에 보관한 다음, 새 스레드를 생성하고,
	// 그 스레드가 라이프 사이클 메소드를 호출하고
	// 그 후에 요청방식에 따라 연동 메소드를 호출하게 됩니다.
	// 서블릿 객체는 싱글톤으로 관리됩니다. 그러므로 서블릿이 갖고 있는
	// 상태정보는 모든 스레드에게 공유됩니다. 
	protected void doGet(
			HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/plain");
		
		response.getWriter()
			.append("프로젝트 구분 문자열(Context Path) : ")
			.append(request.getContextPath());
		//프로젝트 구분 문자열(Context Path) : /1-hello-world
		
		
//		response.setContentType("text/plain;charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		out.println();
		out.println("## 초기 파라미터들 ##");
		// 파라미터의 이름을 가지고 옵니다.
		Enumeration<String> e = getInitParameterNames(); 
		while (e.hasMoreElements()) {
			String name = (String) e.nextElement();
			// 이름을 가지고 값을 구할 수 있습니다.
			out.println(name + " : " + getInitParameter(name)); 
		}
	}

	protected void doPost(
			HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}

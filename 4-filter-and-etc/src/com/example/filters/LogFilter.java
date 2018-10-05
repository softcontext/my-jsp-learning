package com.example.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class LogFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		System.out.println(">> LogFilter Object Created.");
	}

	@Override
	public void doFilter(ServletRequest req, 
			ServletResponse res, FilterChain chain) throws IOException, ServletException {
		
		System.out.println("브라우저 ==LogFilter==> 서블릿");
		
		// 위의 코드는 서블릿 이전에 작동하고 
		
		// 다수의 필터가 존재하는 경우, 다음 필터의 doFilter 메소드를 호출합니다.
		chain.doFilter(req, res); 
		
		// 아래 코드는 서블릿 이후에 작동합니다.
		
		System.out.println("브라우저 <==LogFilter== 서블릿");
	}
	
	@Override
	public void destroy() {
		System.out.println("<< LogFilter Object will be terminated.");
	}
}

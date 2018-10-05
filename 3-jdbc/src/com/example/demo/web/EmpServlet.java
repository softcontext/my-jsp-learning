package com.example.demo.web;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.demo.dao.EmpDao;
import com.example.demo.dao.EmpDaoImpl;
import com.example.demo.model.Emp;

@WebServlet({ "/", "/emps" })
public class EmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EmpDao empDao = new EmpDaoImpl();
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// DAO 객체에게 데이터를 구해달라고 요청합니다.
		List<Emp> emps = empDao.findAll();
		
		// 데이터를 JSP에게 전달합니다.
		req.setAttribute("emps", emps);
		
		// 화면처리를 JSP에게 위임합니다.
		String path = "emp-list.jsp";
		req.getRequestDispatcher(path).forward(req, res);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		doGet(req, res);
	}
}

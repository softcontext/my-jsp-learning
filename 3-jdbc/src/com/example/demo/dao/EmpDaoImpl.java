package com.example.demo.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.Emp;

public class EmpDaoImpl implements EmpDao {

	@Override
	public int insert(Emp emp) {
		
		return 0;
	}

	@Override
	public int update(Emp emp) {
		
		return 0;
	}

	@Override
	public int delete(int empno) {
		
		return 0;
	}

	@Override
	public int count() {
		
		return 0;
	}

	@Override
	public List<Emp> findAll() {
		Connection conn = null;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			// 1. 디비와 연결
			// 디비 연결 드라이버를 활성화
			Class.forName("oracle.jdbc.driver.OracleDriver"); 
			// 디비 연결 객체를 획득
			String url = "jdbc:oracle:thin:@192.168.0.27:1521:TOPCREDU";
			conn = DriverManager
					.getConnection(url, "scott", "tiger");
			
			// System.out.println(conn);
			// oracle.jdbc.driver.T4CConnection@131276c2
			
			// 2. 질의
			// Connection 객체로부터 질의 객체를 획득합니다.
			// 질의 객체에 SQL 문자열과 필요 시, 파라미터를 추가로 설정합니다.
			String sql = "select * from emp9";
			ps = conn.prepareStatement(sql);
			
			// 3. 결과를 처리
			rs = ps.executeQuery();
			// 리턴 자료형에 따라 결과를 가공하여 리턴합니다.
			List<Emp> emps = new ArrayList<>();
			// rs.next():
			// #1. 행을 가리키는 커서를 한칸 밑으로 이동시킨다.
			// #2. 해당 행에 데이터가 있으면 true를 없으면 false를 리턴한다.
			while (rs.next()) {
				Emp e = new Emp();
				e.setEmpno(rs.getInt("empno"));
				e.setEname(rs.getString("ename"));
				e.setJob(rs.getString("job"));
				e.setSal(rs.getDouble("sal"));
				emps.add(e);
			}
			// 가공이 끝난 결과를 리턴합니다.
			return emps;
			
		} catch (Exception e) {
			System.out.println(e);
			// java.lang.ClassNotFoundException: 
			// oracle.jdbc.driver.OracleDriver
		} finally {
			// 4. 사용이 끝난 리소스를 해제(반드시 수행해야 함)
			try {
				if (rs != null) {
					rs.close();
				}
				if (ps != null) {
					ps.close();
				}
				if (conn != null) {
					conn.close();
				}
			} catch (Exception ignore) {}
		}
		
		return null;
	}

	@Override
	public Emp findOne(int empno) {
		
		return null;
	}

	// 이 클래스 안에 메소드가 제대로 작동함을 테스트하기 위한 코드입니다.
	public static void main(String[] args) {
		EmpDao dao = new EmpDaoImpl();
		List<Emp> emps = dao.findAll();
		for (Emp emp : emps) {
			System.out.println(emp);
		}
	}
}






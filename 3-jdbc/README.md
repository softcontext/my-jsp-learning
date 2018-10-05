작업순서
-------------------

1. 연동할 DB 정보 확인
  Oracle > Scott > Emp9 > Columns 
  
2. 데이터를 묶어서 취급하는 VO 클래스
  Emp
  
3. 디비와 대화하는 DAO 클래스
  EmpDao 인터페이스
  EmpDaoImpl 구현클래스 
  
4. 브라우저와 대화하는 Servlet 클래스
   EmpServlet
   
5. 데이터를 사용하여 화면을 구성
  emp-list.jsp

6. 결과 확인
http://localhost:8080/3-jdbc/
http://localhost:8080/3-jdbc/emps






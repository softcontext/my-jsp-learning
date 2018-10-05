package com.example.demo.model;

// 다수의 값을 하나의 객체로 묶어서 이동시키기 위한 용도의 클래스입니다.
// 이런 클래스를 관점에서 따라서 VO(Value Object), 
// DTO(Data Transfer Object), Model, Entity 등으로 부릅니다.
public class Emp {
//	Java Bean 규약:
//	프레임워크 소스코드와 개발자가 추가로 작성하는 클래스의 소스코드가
//	서로 무리없이 연계하여 작동하기 위해서 규약을 만들었습니다.
//	VO 클래스는 멤버변수에 private을 붙이고
//	대신 getter, setter 메소드를 제공해야 합니다.
	private int empno;
	private String ename;
	private String job;
	private double sal;

	public Emp() {
	}

	public Emp(int empno, String ename, String job, double sal) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + ", job=" + job + ", sal=" + sal + "]";
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

}

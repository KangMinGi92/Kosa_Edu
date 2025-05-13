package com.self.vo;

/*
 	필드 3개를 가지고 있는 Emplyee 클래스를 작성한다.
	Setter/getter는 자동으로 입력한다.
	값이 주입되는 통로는 생성자이다.
	필드 정보를 toString 오버라딩한다.
 */
public class Employee {
	private int empNo;
	private String name;
	private double salary;
	public Employee() {
		super();
	}
	public Employee(int empNo, String name, double salary) {
		super();
		this.empNo = empNo;
		this.name = name;
		this.salary = salary;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", name=" + name + ", salary=" + salary + "]";
	}
	
	
}

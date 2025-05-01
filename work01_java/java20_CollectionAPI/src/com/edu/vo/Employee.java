package com.edu.vo;


public class Employee implements Comparable<Employee>{
	private int empNo;
	private String name;
	private Double salary;

//	public Employee() {}

	public Employee (int empNo, String name, double salary) {
		this.empNo = empNo;
		this.name = name;
		this.salary = salary;
	}

	public int getEmpNo() {
		return empNo;
	}

	public String getName() {
		return name;
	}

	public double getSalary() {
		return salary;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empNo=" + empNo + ", name=" + name + ", salary=" + salary + "]";
	}

	@Override
	public int compareTo(Employee e) {
		return -Double.compare(salary, e.getSalary()); // 디폴트는 오름차순이고 , -붙여 음수를 반환하면 내림차순정렬
	}



}

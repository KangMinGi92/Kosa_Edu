package com.edu.vo;
//Super Class...
public class Employee {
	int empId;
	String name;
	String addr;
	int salary;
	
	public Employee() {	}
	
	public Employee(int empId, String name, String addr, int salary) {
		super();
		this.empId = empId;
		this.name = name;
		this.addr = addr;
		this.salary = salary;
	}

	public int getEmpId() {
		return empId;
	}

	public String getName() {
		return name;
	}

	public String getAddr() {
		return addr;
	}

	public int getSalary() {
		return salary;
	}
	
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", name=" + name + ", addr=" + addr
				+ ", salary=" + salary + "]";
	}		
}












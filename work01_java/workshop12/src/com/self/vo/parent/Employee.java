package com.self.vo.parent;

import com.self.util.MyDate;

public class Employee {
	private int empno;
	private String name;
	private int salary;
	private int annualLeave;
	private MyDate birthDate;
	
	public Employee() {
	}

	public Employee(int empno, String name, int salary, int annualLeave, MyDate birthDate) {
		super();
		this.empno = empno;
		this.name = name;
		this.salary = salary;
		this.annualLeave = annualLeave;
		this.birthDate = birthDate;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
		this.empno = empno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public int getAnnualLeave() {
		return annualLeave;
	}

	public void setAnnualLeave(int annualLeave) {
		this.annualLeave = annualLeave;
	}

	public MyDate getMyDate() {
		return birthDate;
	}

	public void setMyDate(MyDate birthDate) {
		this.birthDate = birthDate;
	}

	@Override
	public String toString() {
		return "Employee [empno=" + empno + ", name=" + name + ", salary=" + salary + ", annualLeave=" + annualLeave
				+ ", myDate=" + birthDate + "]";
	}


	
	
}

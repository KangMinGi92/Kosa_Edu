package com.edu.overloading.test;

import com.edu.overloading.Employee;

public class EmployeeTest1 {

	public static void main(String[] args) {
		Employee e1 = new Employee(7788); // 필드초기화 하지않아 기본값대입됨
		Employee e2 = new Employee(7369, "SCOTT"); // empno랑 name만 필드초기화하고 나머지값은 기본값 대입됨
		Employee e3 = new Employee(7521, "ADAMs",30000.0, "Brandon");
		
		System.out.println(e1.getDetails());
		System.out.println(e2.getDetails());
		System.out.println(e3.getDetails());

		

	}

}

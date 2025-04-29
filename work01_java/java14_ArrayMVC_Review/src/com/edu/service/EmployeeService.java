package com.edu.service;
//나중에 DAO클래스가 된다.

import com.edu.overloading.Employee;

/*
 	클래스를 통해서 단 하나의 인스턴스만 생성되도록 강제
 	싱글톤 패턴
	
	1. 해당 클래스에서 하나의 객체를 일단 생성
		private static 객체생성
		
	2. 다른곳에서는 생성하지 못하도록 막아둔다.
		생성자 앞에 private 접근지정자를 붙인다.
		
	3. 하나 생성한 인스턴스를 여기저기서 가져다 쓸 수 있도록 열어둠 (단 외부에서 접근해야하기때문에 static으로 미리 메모리에 올려둬야함!!)
		public static EmployeeService getInstance(){
		return service;
		}
 */
public class EmployeeService {
	//1.
		private static EmployeeService service = new EmployeeService();
	//2.
		private EmployeeService() {
			System.out.println("EmployeeService Creating....");
		}
	//3.
		public static EmployeeService getInstance() {
			return service;
		}
	
		
		//서비스 기능...
		public void addEmployee(Employee e) {
			System.out.println(e.getDetails()+" 님 가입 성공^^");
		}
		
		public String getEmployee(String name) {
			return name+" 검색 성공 ^^";
		}
		
		
}

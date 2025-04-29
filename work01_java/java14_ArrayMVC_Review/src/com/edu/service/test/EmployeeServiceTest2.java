package com.edu.service.test;

import com.edu.overloading.Employee;
import com.edu.service.EmployeeService;

public class EmployeeServiceTest2 {

	public static void main(String[] args) {
		//EmployeeService클래스의 addEmployee() 요청
		EmployeeService service = EmployeeService.getInstance();
		EmployeeService service2 = EmployeeService.getInstance();
		EmployeeService service3 = EmployeeService.getInstance();
		
		service.addEmployee(new Employee(7656,"James"));
		System.out.println(service);
		System.out.println(service2);
		System.out.println(service3); //service,service2,service3는 주소값이 같다!!==> 즉 같은 객체를 참조한다.
		System.out.println("===================================");
		System.out.println(service.toString());
		System.out.println(service2.toString());
		System.out.println(service3.toString());
	}

}

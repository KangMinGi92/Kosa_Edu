package com.edu.test;

import java.util.ArrayList;

import com.edu.exception.DuplicateEmpException;
import com.edu.exception.RecordNotFoundException;
import com.edu.service.impl.EmployeeMapServiceImpl;
import com.edu.vo.Employee;
import com.edu.vo.Engineer;
import com.edu.vo.Manager;

public class EmployeeListServiceTest {

	public static void main(String[] args) {
		// 1. Service 생성된 객체를 하나 받아온다..
		EmployeeMapServiceImpl service = EmployeeMapServiceImpl.getInstance();

		// 2. method를 각각 호출..
		System.out.println("======================== 1. add ================================== ");
		Manager m1 = new Manager(111, "강호동", "방배동", 500, "개발부");
		Manager m2 = new Manager(222, "이수근", "여의도", 400, "오락부");
		Manager m3 = new Manager(333, "서장훈", "방배동", 600, "개발부");

		Engineer eg1 = new Engineer(444, "김희철", "신대방동", 450, "Python", 100);
		Engineer eg2 = new Engineer(555, "이상민", "이태원", 500, "JS", 300);
		try {
			service.addEmployee(m1);
		} catch (DuplicateEmpException e) {
			System.err.println(e.getMessage());
		}
		try {
			service.addEmployee(m2);
		} catch (DuplicateEmpException e) {
			System.err.println(e.getMessage());
		}

//		service.addEmployee(m3);
//		service.addEmployee(eg1);
//		service.addEmployee(eg2);
		// service.addEmployee(m3);

//		service.findEmployees();

		System.out.println("======================== 2. delete ================================== ");
		try {
		service.deleteEmployee(112);
		}catch(RecordNotFoundException e) {
			System.err.println(e.getMessage());
//			e.printStackTrace();  오류라인 및 오류정보를 세세하게 나타내주지만, 보안에 취약하여 사용하지 않는다.
		}
		ArrayList<Employee> emps=service.findEmployees("방배동");
		System.out.println(emps);
		
		ArrayList<Employee> emps2=service.findEmployees();
		System.out.println(emps2);
		
//		service.findEmployees("서초동");
//	
//		System.out.println("========================");

	}
}

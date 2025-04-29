package com.edu.method.test;

import java.util.Date;
import java.util.Scanner;

import com.edu.method.Employee;

public class EmployeeTest {

	public static void main(String[] args) {
		/*
		 	1. Employee를 메모리(jvm, platform)에 올린다
		 	2. 4개의 멤버가 올라간다...접근해서 사용
		 		필드 접근---> 필드초기화
		 		메소드 ---> 메소드호출
		 */
		
		Employee e=new Employee();
		e.name="James";
		e.address = "Texas";
		//Date...클래스 타입...값을 어떻게 할당?  -> 객체로 만들어서 넣어야 한다.
		Date date = new Date(2008, 10, 21);
		e.hiredate = date;
//		e.printEmployee();
		System.out.println(e.getEmployee());
	}

}

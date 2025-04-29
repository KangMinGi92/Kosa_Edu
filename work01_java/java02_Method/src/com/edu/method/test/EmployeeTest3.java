package com.edu.method.test;

import java.util.Date;
import java.util.Scanner;

import com.edu.method.Employee;

public class EmployeeTest3 {

	public static void main(String[] args) {
		/*
		 	Employee 3명을 각각 생성
		 	James, Scott, Adams
		 	
		 	필드에 값 할당은 setEmployee 함수로
		 	필드에 주입된 값은 getEmployee 함수로 출력
		 	
		 */
		Employee e1=new Employee();
		e1.setEmployee("James", "Texas", new Date(2000,1,2));
		System.out.println(e1.getEmployee());
		
		Employee e2=new Employee();
		e2.setEmployee("Scott", "NewYork",  new Date(2001,2,3));
		System.out.println(e2.getEmployee());
		
		Employee e3=new Employee();
		e3.setEmployee("Adams", "Brandon",  new Date(2008,1,3));
		System.out.println(e3.getEmployee());
		
	}
}
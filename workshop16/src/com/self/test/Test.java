package com.self.test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

import com.self.vo.Employee;

public class Test {

	public static void main(String[] args) {
		List<Employee> list = Arrays.asList(
				new Employee(1,"Scott",30000.0),
				new Employee(2,"Adams",25000.0),
				new Employee(3,"Smith",21000.0),
				new Employee(4,"King",50000.0)
		);
		System.out.println("\n====1. 직원 급여를 15% 인상한 정보를 출력 :: forEach 사용====");
		list.forEach(e->{
			e.setSalary(e.getSalary()+e.getSalary()*0.15);
			System.out.println(e);
		});
//		Consumer 함수형 인터페이스 구현방식으로 각 직원 급여의 15% 인상분을
//		구현하고 raiseSalary 함수에서 해당 인터페이스 함수를 호출한다.
		System.out.println("\n====2. 직원 급여를 15% 인상한 정보를 출력 :: Consumer로 구현====");
		Consumer<Employee> consumer=e->e.setSalary(e.getSalary()+e.getSalary()*0.15);
		raiseSalary(list,consumer.andThen(System.out::println));
		
	}//main
	private static void raiseSalary(List<Employee> emps,Consumer<Employee> c) {
		for(Employee e : emps) 
			c.accept(e);
		
	}
}//class

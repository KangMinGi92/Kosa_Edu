package com.edu.test2;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

import com.edu.vo.Employee;

public class HashMapTest {

	public static void main(String[] args) {
		Map<Integer, Employee> map = new HashMap<>();
		map.put(111, new Employee(111, "이수근", 20000.0));
		map.put(444, new Employee(444, "서장훈", 25000.0));
		map.put(333, new Employee(333, "김영철", 32000.0));
		map.put(777, new Employee(777, "김희철", 18000.0));
		map.put(222, new Employee(222, "강호동", 37000.0));

		// 1.map에 저장된 멤버중에서 777키값에 해당하는 멤버를 출력
		System.out.println(map.get(777));
		// 2.이름이 서장훈인 멤버를 찾아서 그 사람의 급여를 출력
		for (Employee e : map.values()) {
			if (e.getName().equals("서장훈")) {
				System.out.println("서장훈님의 급여는 " + e.getSalary() + "만원 입니다.");
			}
		}
		// 3.멤버중에서 가장 많은 급여를 받는 멤버와 가장 적은 급여를 받는 멤버의 이름을 출력
		double max = 0;
		double min = Double.MAX_VALUE;

		// 1) for문 돌려서 max, min 찾는방법

//		Employee maxEmployee = null;
//		Employee minEmployee = null;
//
//		for (Employee e : map.values()) {
//			if (e.getSalary() > max) {
//				max = e.getSalary();
//				maxEmployee = e;
//			}
//			if (e.getSalary() < min) {
//				min = e.getSalary();
//				minEmployee = e;
//			}
//		}
//		System.out.println("최고 급여를 받는 사람은 " + maxEmployee.getName() + ", 급여는 " + max + "만원 입니다.");
//		System.out.println("최고 급여를 받는 사람은 " + minEmployee.getName() + ", 급여는 " + min + "만원 입니다.");

		// 2) Collections.max(), Collections.min() 사용

//		List<Double> list = new ArrayList<>();
//		for (Employee e : map.values())
//			list.add(e.getSalary());
//		
//		max = Collections.max(list);
//		min = Collections.min(list);
//		System.out.println("최대급여는 " + max + "만원");
//		System.out.println("최소급여는 " + min + "만원");

		// 3) Collections.sort() 사용

//		Comparator<Employee> salaryComporator = new Comparator<Employee>() {
//			@Override
//			public int compare(Employee e1, Employee e2) {
//				return Double.compare(e1.getSalary(), e2.getSalary());
//			}
//		};
//		
//		Employee maxEmp = Collections.max(map.values(),salaryComporator);
//		System.out.println(maxEmp);
//		
//		Employee minEmp = Collections.min(map.values(),salaryComporator);
//		System.out.println(minEmp);

		// 4) 람다 Collection
		Collection<Employee> employees = map.values();
		Comparator<Employee> sortSal = Comparator.comparing(Employee::getSalary);
		Employee maxEmp = Collections.max(employees, sortSal);
		Employee minEmp = Collections.min(employees, sortSal);
		System.out.println("==================================");
		System.out.println(maxEmp);
		System.out.println(minEmp);

		// 4. 만약에 888번 직원이 존재하지 않는다면 888번 직원을 추가등록...유재석
		if (!map.containsKey(888))
			map.put(888, new Employee(888, "유재석", 0.0));
		System.out.println("==================================");
		for (Employee e : map.values()) {
			System.out.println(e);
		}
		
		// 5. map에 저장된 모든 멤버를 다 지우고 map이 비었는지 의 여부를 최종확인하세요
		map.clear();
		System.out.println("모든 멤버가 삭제되었나요? " + map.isEmpty());
	}

}

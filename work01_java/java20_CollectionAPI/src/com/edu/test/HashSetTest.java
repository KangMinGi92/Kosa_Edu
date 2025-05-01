package com.edu.test;

import java.util.HashSet;
import java.util.Set;

import com.edu.vo.Employee;

public class HashSetTest {
//제네릭을 넣는 이유는 Object로 사용하면 넣기에는 편리하지만 꺼낼때 항상 Casting을 해줘야하는 불편한 점 때문에 
//항상 컨테이너를 만들때에는 제네릭으로 타입을 지정해주는게 사용하기 편리하다
	public static void main(String[] args) {
		//중복을 벗겨내는 Filtering 역하을 한다.
		Set<Employee> set = new HashSet<>();
		Employee e1 = new Employee(111,"이수근",23000.0);
		Employee e2 = new Employee(222,"서장훈",23000.0);
		Employee e3 = new Employee(333,"민경훈",23000.0);
				
		set.add(e1);
		set.add(e2);
		set.add(e3);
		set.add(e1);
		
		System.out.println(set.size() + " 명입니다.");
		System.out.println(set);
		
		//1. 직원중에서 서장훈씨가 포함되어 있는지 여부를 출력
			System.out.println(set.contains(e2)? "서장훈 있음" : "서장훈 없음");
		//2. 이수근씨를 삭제...나머지 직원정보를 출력
			set.remove(e1);
			System.out.println(set);
		//3. set안에 저장된 직원 모두를 삭제...Contatiner가 정말 비워져 있는지 확인
			set.clear();
			System.out.println(set.isEmpty()? "Empty" : "Not Empty");
	}

}

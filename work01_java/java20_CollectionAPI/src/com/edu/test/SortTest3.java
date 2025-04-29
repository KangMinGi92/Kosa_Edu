package com.edu.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.edu.vo.Employee;
//Comparable 방식으로 정렬
public class SortTest3 {
	public static void main(String[] args) {
		// 순서, 정렬
		List<Employee> list = new ArrayList();
		list.add(new Employee(888, "AAA", 80000.0));
		list.add(new Employee(222, "BBB", 21000.0));
		list.add(new Employee(111, "CCC", 22000.0));
		list.add(new Employee(444, "CCC", 23000.0));
	
		
		for(Employee e : list) {
		e.compareTo(e);
		System.out.println(e);
		}
	}

}

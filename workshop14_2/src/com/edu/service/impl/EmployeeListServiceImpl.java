package com.edu.service.impl;

import java.util.ArrayList;
import java.util.Collections;

import com.edu.service.EmployeeListService;
import com.edu.vo.Employee;

public class EmployeeListServiceImpl implements EmployeeListService {

	// 추가
	private ArrayList<Employee> list;

	static private EmployeeListServiceImpl service = new EmployeeListServiceImpl();

	private EmployeeListServiceImpl() {
		list = new ArrayList<Employee>();
	}

	public static EmployeeListServiceImpl getInstance() {
		return service;
	}

	@Override
	public void addEmployee(Employee e) {
		boolean flag = false;
		for (Employee employee : list) {
			if (employee.getEmpId().equals(e.getEmpId())) {
				flag = true;
				System.out.println("이미 등록된 사원번호입니다.");
				break;
			}
		}

		if (flag == false) {
			list.add(e);
			System.out.println(e.getName() + " 님 등록에 성공하셨습니다.");
		}
	}

	@Override
	public void deleteEmployee(String empId) {
		boolean flag = false;
		for (Employee employee : list) {
			if (employee.getEmpId().equals(empId)) {
				flag = true;
				System.out.println(employee.getName() + " 님 삭제 되셨습니다.");
				list.remove(employee);
				break;
			}
		}
		if (flag == false)
			System.out.println(empId + "로 등록된 회원을 찾지 못했습니다.");
	}

	@Override
	public void updateEmployee(Employee e) {
		boolean flag = false;
		int idx = 0;
		for(Employee employee : list) {
			if(employee.getEmpId().equals(e.getEmpId())) {
				flag = true;
				idx=list.indexOf(employee);
				System.out.println(e.getName()+" 님의 정보가 업데이트 되셨습니다.");
				list.set(idx, e);
				break;
			}
		}
		if(flag == false)
			System.out.println(e.getName()+" 님의 정보를 찾을수가 없습니다. ");
	}// updateEmployee

	@Override
	public ArrayList<Employee> findEmployees(String addr) {
		ArrayList<Employee> temp = new ArrayList<Employee>();
		for(Employee e : list) {
			if(addr.equals(e.getAddr())) {
				temp.add(e);
			}
		}
		if(temp.isEmpty()) {
			System.out.println(addr+" 에 해당하는 주소를 가진 직원은 없습니다.");
		}
		return temp;
	}

	@Override
	// 반환값 void라서 여기서 정렬
	public void findEmployees() {
		Collections.sort(list); // 기본적으로 comparable 오름차순 정렬사용
		for(Employee employee : list) {
			System.out.println(employee);
		}

	}
}

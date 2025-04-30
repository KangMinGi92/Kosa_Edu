package com.edu.service.impl;

import java.util.ArrayList;
import java.util.Collections;

import com.edu.service.EmployeeListService;
import com.edu.vo.Employee;
/* 
 	workshop15
 	1.workshop14 ArrayList ---> HashMap
 	2. 강력한 제어문을 사용
 		UserException
 		1) Book이 이미 존재할때
 		2) 삭제하거나 수정할 대상이 없을때
 		3) 비지니스로직과 관련된 또다른 예외클래스
 	3. ~ManagerImpl 클래스에서는
 		기능 위주로 작성된 클래스이기때문에
 		예외 발생시 즉각적인 처리 하지말고 throws 사용해서 던진다.
 	4. ~Test 클래스에서 기능 호출마다 각각 예외를 즉각적으로 처리한다.
 	
 	오늘은 코드구현보다 Jira Tool사용법과 작업방법, 역할 나누기, 문제 해결논의
 	내일 코드 구현시 GitHub Tool을 적극적으로 사용한다.
 	--> 자바 프로젝트 시작이전에 Jira, GitHub 사용법은 어느정도 익혀야한다.
 
 */
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

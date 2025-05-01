package com.edu.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.edu.exception.DuplicateEmpException;
import com.edu.exception.RecordNotFoundException;
import com.edu.service.EmployeeMapService;
import com.edu.vo.Employee;

public class EmployeeMapServiceImpl implements EmployeeMapService{
	
	private Map<Integer, Employee> map;
	
	static private EmployeeMapServiceImpl service = new EmployeeMapServiceImpl();
	private EmployeeMapServiceImpl() {
		map = new HashMap<>();
	}
	
	public static EmployeeMapServiceImpl getInstance() {
		return service;
	}	
	/////////////////////////////////////기본적인 CRUD 작업///////////////////
	@Override
	public void addEmployee(Employee e) throws DuplicateEmpException{		
		if(map.containsKey(e.getEmpId())) //추가대상이 이미 존재한다면
			throw new DuplicateEmpException(e.getName()+"님은 이미 등록되어져 있어요.");
		
		map.put(e.getEmpId(), e);
		System.out.println(e.getName()+" 님이 등록 되었습니다.");
	}

	@Override
	public void deleteEmployee(int empId) throws RecordNotFoundException {	
		Employee delEmp=map.remove(empId);
		if(delEmp==null) 
			throw new RecordNotFoundException("삭제할 직원이 존재하지 않습니다.");
		
		System.out.println("직원번호 "+empId+" 삭제 성공^^");
	}
	@Override
	public void updateEmployee(Employee e) throws RecordNotFoundException{		
		if(!map.containsKey(e.getEmpId())) //수정할 대상이 존재하지 않는다면
			throw new RecordNotFoundException(e.getName()+"님은 등록되어 있지 않습니다.");
		
		map.put(e.getEmpId(), e);
		System.out.println(e.getName()+" 님 수정 성공^^");
	}
	
	@Override
	public ArrayList<Employee> findEmployees(String addr) {
		ArrayList<Employee> temp = new ArrayList<Employee>();
		Set<Integer> set = map.keySet();
		for(Integer no : set) {
			if(map.get(no).getAddr().equals(addr)) {
				temp.add(map.get(no));
			}
		}
		
		return temp;
	}	
	@Override
	public ArrayList<Employee> findEmployees() {
		ArrayList<Employee> temp = new ArrayList<Employee>();
		Set<Integer> set = map.keySet();
		for(Integer no : set) {
			temp.add(map.get(no));
		}
		return temp;
	}
}














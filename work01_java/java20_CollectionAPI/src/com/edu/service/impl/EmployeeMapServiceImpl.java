package com.edu.service.impl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.edu.service.EmployeeMapService;
import com.edu.vo.Employee;

public class EmployeeMapServiceImpl implements EmployeeMapService{
	
	private Map<Integer, Employee> map;
	
	static private EmployeeMapServiceImpl service = new EmployeeMapServiceImpl();
	private EmployeeMapServiceImpl() {
		map = new HashMap<Integer, Employee>();
	}
	
	public static EmployeeMapServiceImpl getInstance() {
		return service;
	}	
	@Override
	public void addEmployee(Employee e) {		
		
	}

	@Override
	public void deleteEmployee(int empId) {		
	
	}
	@Override
	public void updateEmployee(Employee e) {		
		
	}
	
	@Override
	public ArrayList<Employee> findEmployees(String addr) {
		ArrayList<Employee> temp = new ArrayList<Employee>();
		
		
		return temp;
	}	
	@Override
	public ArrayList<Employee> findEmployees() {
		ArrayList<Employee> temp = new ArrayList<Employee>();
		
		return temp;
	}
}














package com.edu.service;

import com.edu.vo.Engineer;
import com.edu.vo.SalesMan;

public class HRService {
	// 필드 레벨에 배열을 선언
	Engineer[] engineers = null;
	int eidx = 0;
	SalesMan[] salesMans = null;
	int sidx = 0;

	// 1.
	private static HRService service = new HRService(10); // 배열의 최대 사이즈

	// 2.
	private HRService(int size) {
		engineers = new Engineer[size];
		salesMans = new SalesMan[size];
	}

	// 3.
	public static HRService getInstance() {
		return service;
	}

	// 서비스 기능을 정의
	// 메소드 오버로딩을 활용해서 메소드명의 아이덴티파이를 일관성있게 할 수 있다.
	// 예) addEngineer, addSalesMan ==> addEmployee로 메소드 오버로딩을 한다.

	/*
	 * CRUD 기본 서비스 기능으로 5개를 만들어야함!! R기능은 2개 CUD기능은 1개 R은 전체정보조회와 조건조회로 2개가 필수적이다.
	 * ex) DB에 접근해서 정보를 가져오는 방향-->R 
	 * public Employee getEmployee(o) 
	 * public Employee[] getAllEmployee()
	 * 
	 * DB에 접근해서 정보를 조작하는 방향-->CUD 
	 * public void addEmployee(o) 
	 * public void updateEmployee(o)
	 * public void removeEmployee(int empno)
	 */
	// 특정한 정보를 추가하는 기능 C
	public void addEmployee(Engineer engineer) {
		// engineer를 배열에 추가하고...인덱스를 하나 증가
		if (eidx == engineers.length) {
			System.out.println("더이상 엔지니어 등록을 할 수 없습니다.");
		} else {
			engineers[eidx++] = engineer;
			System.out.println(engineer.getName() + " 님이 등록 되셨습니다.");
		}
	}

	public void addEmployee(SalesMan salesMan) {
		// salesMan를 배열에 추가하고...인덱스를 하나 증가
		if (sidx == salesMans.length) {
			System.out.println("더이상 세일즈맨 등록을 할 수 없습니다.");
		} else {
			salesMans[sidx++] = salesMan;
			System.out.println(salesMan.getName() + " 님이 등록 되셨습니다.");
		}

	}

	// empno에 해당하는 나머지 정보를 수정하는 기능 U
	public void updateEmployee(Engineer engineer) {
		// 배열안에서 수정하고자 하는 대상을 찾아서... empno..mainSkill을 수정
		for (Engineer e : engineers) {
			if (e == null) // engineers의 배열에 null이 들어가면 continue가 실행되도록 한다.!!
				continue;
			if (e.getEmpno() == engineer.getEmpno())
				e.changeMainSkill(engineer.getMainSkill());
		}
	}

	public void updateEmployee(SalesMan salesMan) {
		// 배열안에서 수정하고자 하는 대상을 찾아서... empno..bonus을 수정

		for (SalesMan s : salesMans) {
			if (s == null) // salesMans의 배열에 null이 들어가면 continue가 실행되도록 한다.!!
				continue;
			if (s.getEmpno() == salesMan.getEmpno())
				s.changeBonus(salesMan.getBonus());
		}
	}
//	public void getEmployeeInfo() {
//		for(Engineer e : engineers) {
//			if (e == null)
//				break;
//			System.out.println(e);
//		}
//		for(SalesMan s : salesMans) {
//			if (s == null)
//				break;
//			System.out.println(s);
//		}
//	} ==> 정보를 검색하는 기능으로 업그레이드

	// 정보를 검색하는 기능... R
	public Engineer getEngineer(int empno) {
		Engineer find1 = null;
		for (Engineer e : engineers) {
			if (e.getEmpno() == empno) {
				find1 = e;
				break;
			}
		}
		return find1;
	}
	public SalesMan getSalesMan(int empno) {
		SalesMan find2 = null;
		for (SalesMan s : salesMans) {
			if (s.getEmpno() == empno) {
				find2 = s;
				break;
			}
		}
		return find2;
	}
	public Engineer[] getAllEngineer() {
		return engineers;
	}
	public SalesMan[] getAllSalesMan() {
		return salesMans;
	}
	// 특정한 대상을 삭제하는 기능...D
	public void deleteEmployee(int empno) {
		int find = -1;
		for(int i=0;i<eidx;i++) {
			if(engineers[i].getEmpno()==empno) {
				find=i;
				break;
			}
		}
		if(find==-1) {
			System.out.println("삭제할 대상을 찾지 못했습니다.");
			return;
		}
		for(int j=find;j<eidx;j++)
			engineers[j]=engineers[j+1];
		
		eidx--;
//		for(int i=0; i<engineers.length;i++) {
//			for(int j=0;j<j+1;j++) {
//				if(engineers[i]==null) continue;
//				if(engineers[i].getEmpno()==empno) {
//					engineers[i]=engineers[i+1];
//					j=i;
//					break;
//				}
//			}
//		}
	}
}// class

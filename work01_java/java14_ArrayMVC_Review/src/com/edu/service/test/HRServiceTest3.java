package com.edu.service.test;

import com.edu.service.HRService;
import com.edu.util.MyDate;
import com.edu.vo.Engineer;
import com.edu.vo.SalesMan;

public class HRServiceTest3 {
	public static void main(String[] args) {
		//1. HRService 객체를 하나 받아온다.
			HRService service = HRService.getInstance();
		//2. addEngineer() 호출 ...3번 ... Engineer를 3명 등록
			System.out.println("============addEmployee Engineer===============");
			service.addEmployee(new Engineer(1,"강민기","java",new MyDate(2024,04,21)));
			service.addEmployee(new Engineer(2,"우승환","java",new MyDate(2024,04,21)));
			service.addEmployee(new Engineer(3,"박성우","java",new MyDate(2024,04,21)));
		//3. addSalesMan() 호출 ...2번 ... SalesMan을 2명 등록
			System.out.println("============addEmployee SalesMan===============");
			service.addEmployee(new SalesMan(4,"James",100,new MyDate(2024,04,21)));
			service.addEmployee(new SalesMan(5,"Adam",200,new MyDate(2024,04,21)));
		//4. 2번째 Engineer의 mainSkill을 변경
			System.out.println("============updateEmployee Engineer,SalesMan===============");
			service.updateEmployee(new Engineer(2,"우승환","javascript",new MyDate(2024,04,21)));
		//5. 1번째 SalesMan의 bonus를 변경
			service.updateEmployee(new SalesMan(4,"James",500,new MyDate(2024,04,21)));
		//6. 모든 Engineer,SalesMan의 정보를 콘솔로 출력
//			service.getEmployeeInfo();
			System.out.println("2 사원의 정보를 수정했습니다.");
			System.out.println(service.getEngineer(2));
			System.out.println("4 사원의 정보를 수정했습니다.");
			System.out.println(service.getSalesMan(4));
			System.out.println("모든사원의 정보를 출력 합니다.");
			Engineer[] engineers = service.getAllEngineer();
			SalesMan[] salesMans = service.getAllSalesMan();
			for(Engineer e : engineers) {
				if(e==null) break;
				System.out.println(e);
			}
			for(SalesMan s : salesMans) {
				if(s==null) break;
				System.out.println(s);
			}
		//7. 특정 엔지니어를 제거
			System.out.println("============deleteEmployee Engineer==================");
			service.deleteEmployee(2);
			Engineer[] engineers2 = service.getAllEngineer();
			for(Engineer e : engineers2) {
				if(e==null) break;
				System.out.println(e);
			}
			/*
			 1. vo클래스에서 toString()기능을 필드를 반환하는 기능으로 변경해서 사용
			 2. 여러개의 객체를 관리할때 가장 기본적인 기능
			 	C/R/U/D ...서버와 DB사이를 왔다갔다 하는 방향성으로 차이점을 구분
			 3.	R기능이 가장 많이 사용
			 	getXxxx(int no) | getAllXxxx() 오버로딩
			*/
			
	}	

}

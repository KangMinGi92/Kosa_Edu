package com.edu.constructor.test;

import com.edu.constructor.NoteBook;
import com.edu.constructor.Programmer;

public class ProgrammerTest {

	public static void main(String[] args) {
		/*
		 1. Programmer 객체를 2명 생성
		 	James, 김안나
		 2. James가 Apple사 노트북을 구매
		 	김안나가 LG사 노트북을 구매
		 3. James의 연봉을 출력
		 4. 김안나의 급여를 50만원 인상
		 	김안나의 연봉을 출력
		 5. 각각 개발자의 정보를 최종적으로 출력
		 */
	Programmer james=new Programmer("James","java",200.0,1000);
	Programmer anna=new Programmer("김안나","html",100.0,500);
	james.buyNoteBook(new NoteBook(1L,"Apple",200.0f));
	anna.buyNoteBook(new NoteBook(2L,"LG",150.0f));

	double AnnualSalary1=james.getAnnualSalary();
	System.out.println("James의 연봉은 "+AnnualSalary1+"달러입니다.\n");
	anna.raiseSalary(50);
	double AnnualSalary2=anna.getAnnualSalary();
	System.out.println("김안나의 연봉은 "+AnnualSalary2+"달러입니다.\n");
	
	System.out.println(james.getProgrammerInfo());
	System.out.println(anna.getProgrammerInfo());
	
	
	}

}

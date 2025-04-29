package com.edu.constructor.test;

import com.edu.constructor.NoteBook;
import com.edu.constructor.Programmer;

/*
 	NoteBook -----> Programmer
 	Hasing 공식
 	class Programmer{
 		1. 필드 선언
 		NoteBook noteBook;
 		
 		2. 주입통로 2가지(생성자,setNoteBook())
 		public void setNoteBook(NoteBook noteBook){
 			this.noteBook.=noteBook;
 		
 		}
 		
 	}
 	
 */
public class ProgrammerTest2 {

	public static void main(String[] args) {

	Programmer james=new Programmer("James","java",200.0,1000);
	Programmer anna=new Programmer("김안나","html",100.0,500);
	james.buyNoteBook(new NoteBook(1L,"Apple",200.0f));
	anna.buyNoteBook(new NoteBook(2L,"LG",150.0f));
	
	james=anna; //james에 anna를 덮어 씌우면 james는 stack영역으로부터 참조가 끊어진 Heap영역의 객체를 쓰레기 객체라 하고 이런것들이 많아질수록
	//성능이 떨어진다. 제거해야한다... 자동적으로 제거하는 시스템
	//Garbage Collector(GC)
	//1. 언제 제거할지 모른다.
	//2. 알아서 해준다.(처음엔 Thread가 1로 시작하지만 heap영역이 찰수록 정리해줘야해서 Thread가 점차 증가하면서 알아서 제거 후, 다시 Thread1로 감소한다.)
	//즉==> 완전 오토매티컬하다.
	//Thread(1~~~10) 1에 가까울수록 우선순위낮음.
	System.out.println(james);
	System.out.println(anna);
//	
//	System.out.println(james.getNoteBook().getDetails());//코드를 체이닝처럼 활용해야 클린코드를 할 수있다.
//	
//	double AnnualSalary1=james.getAnnualSalary();
//	System.out.println("James의 연봉은 "+AnnualSalary1+"달러입니다.\n");
//	anna.raiseSalary(50);
//	double AnnualSalary2=anna.getAnnualSalary();
//	System.out.println("김안나의 연봉은 "+AnnualSalary2+"달러입니다.\n");
//	
	System.out.println("\n============James,Anna의 Information============");
	System.out.println(james.getProgrammerInfo());
	System.out.println(anna.getProgrammerInfo());
	
	System.out.println("\n==============================");
	System.out.println(james);
	//com.edu.constructor.Programmer@e9e54c2
	//com.edu.constructor.Programmer : (Full Qualified Class Name) 클래스의 풀네임
	//e9e54c2 : 객체의 주소값이다.
	//두개를 합쳐서 표현해야 JVM이 정확하게 인식할 수 있다.
	System.out.println(anna);
	
	}

}

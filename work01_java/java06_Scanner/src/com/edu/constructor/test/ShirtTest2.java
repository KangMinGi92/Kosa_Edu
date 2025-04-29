package com.edu.constructor.test;
import java.util.Scanner;

/*
 ShirtTest는 Shirt객체를 생성할때 인자값으로 실제값을 바로 입력했다.
 즉, 컴파일 시점에 실제값이 입력되었다.
 프로그램은 실행할때마다 서로 다른값을 받아들일 수 있는 통로를 가져야 한다.
 
 실행시점에서 값을 받아들이기 위해서는 Scanner를 사용할 수 있어야 한다.
 우리는 실행할때 키보드를 통해서 원하는 값을 읽어들이는 Scanner를 사용할 것이다.
 
 1. Scanner 객체생성
 	Scanner
 */
import com.edu.constructor.Shirt;

public class ShirtTest2 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in); //키보드를 통해서 읽어들이는 Scanner생성
		System.out.println("원하는 셔츠 정보를 키보드로 입력받으세요>>>");
//		
//		System.out.println("셔츠 메이커 입력 ==>");
//		String maker=sc.nextLine(); //Enter값이 입력되어야 다음 라인으로 넘어간다.
//		
//		System.out.println("셔츠 사이즈 입력 ==>");
//		int size=sc.nextInt();
//		
//		System.out.println("셔츠 긴팔여부 입력 ==>");
//		boolean longSleeved=sc.nextBoolean();
		
		System.out.println("셔츠 메이커,사이즈,긴팔여부입력==>");
		String maker=sc.next();
		int size=sc.nextInt();
		boolean longSleeved=sc.nextBoolean();
		Shirt longT=new Shirt(maker,size,longSleeved);
		System.out.println(longT.getDetails());
	}

}

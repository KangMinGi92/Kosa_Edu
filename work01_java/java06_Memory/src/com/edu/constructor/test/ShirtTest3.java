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

public class ShirtTest3 {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in); //키보드를 통해서 읽어들이는 Scanner생성
		System.out.println("원하는 셔츠 정보를 키보드로 입력받으세요>>>");
		
		System.out.println("셔츠 메이커,사이즈,긴팔여부입력==>");
		
		String maker=sc.next();
		String s=sc.next();
		//parseInt()는 static한 성질의 기능이기 때문에
		//객체생성할 필요없다. 이유는 미리 메모리에 올라가있는 기능이다.
		//클래스이름.기능(); 바로 사용할 수 있다.
		int size=Integer.parseInt(s);
		
		String ls=sc.next();
		
		boolean longSleeved=Boolean.parseBoolean(ls);
		sc.nextLine(); //중간에 버퍼를 비워주지 않으면 다음 nextLine()사용시 입력값을 받을수 없다. ==> 즉 next(),nextInt()는 사용후 다음nextLine()사용전에 비워줘야한다.
		String test=sc.nextLine();
		System.out.println(test);
		/*
		 size ::: String --> int
		 longSleeved ::: String --> boolean
		 으로 데이터 형을 바꿔줘야한다.
		 
		 형변환!! 시켜주는 기능을 연결
		 */
		
		Shirt longT=new Shirt(maker,size,longSleeved);
		System.out.println(longT.getDetails());
	}

}

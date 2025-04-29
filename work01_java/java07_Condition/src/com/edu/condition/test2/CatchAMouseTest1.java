package com.edu.condition.test2;

import java.util.Scanner;

/*
 	1			3			2
 (Cat A)	(Cat B)		(Mouse)
 
  (Cat A)	(Mouse)		(Cat B)
 */
public class CatchAMouseTest1 {

	public static void main(String[] args) {
		// main method에서는 서비스 요청(Scanner 값입력), 메소드 호출, 메소드호출응답 3가지만 있어야 clean code 작성법에
		// 해당된다.

		// 1. Scanner객체 생성
		System.out.println("Cat A, Cat B, Mouse 각각의 위치를 숫자로 입력");
		Scanner sc = new Scanner(System.in);

		// 2. 각각의 위치값을 3개의 변수에 저장
		int catA = sc.nextInt();
		int catB = sc.nextInt();
		int mouse = sc.nextInt();

		CatAMouse algo = new CatAMouse();
		String result = algo.solv(catA, catB, mouse);
		System.out.println(result);

	}
}

class CatAMouse {
	public String solv(int catA, int catB, int mouse) {
		//이 부분을 제어문을 잘 사용해서 구현...
//		if(Math.abs(catA-mouse)>Math.abs(catB-mouse))
//			return "catB catch a mouse";
//		else if(Math.abs(catA-mouse)<Math.abs(catB-mouse))
//			return "catA catch a mouse";
//		else 
//			return "Mouse Escapes!!!";
		int aDistance = Math.abs(catA-mouse);
		int bDistance = Math.abs(catB-mouse);
		if(aDistance>bDistance)
			return "catB catch a mouse";
		else if(aDistance<bDistance)
			return "catA catch a mouse";
		else 
			return "Mouse Escapes!!!";
	}
}
/*
 * CatA catch a mouse CatB catch a mouse Mouse Escape!!
 * 
 * Math클래스에서 거리를....함수
 */
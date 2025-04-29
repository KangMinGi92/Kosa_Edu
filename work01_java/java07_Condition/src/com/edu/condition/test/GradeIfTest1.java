package com.edu.condition.test;

import java.util.Scanner;

/*
	조건문,제어문 : 특정한 조건을 만족하는 동안 문장을 수행할 수 있도록 제어하는 역할을 한다.
Syntax >>

1.	if(조건){
		조건이 true를 반환하면 이 부분이 수행
	}

2.	if(조건1){
		조건1을 만족할때만 수행
	}else if(조건2){
		조건2를 만족할때만 수행
	}else if(조건3){
		조건3을 만족할때만 수행
	}else{
		위의 조건 1,2,3에 만족하는 경우가 없을때 이곳이 실행된다.
	}
3. switch(grade){
	case(90) : System.out.println("A grade"); break;
	case(80) : System.out.println("B grade"); break;
	default : System.out.println("아무것도 해당되지 않으면 기본값");
	case(60,70) 이러한 문법은 성립되지 않는다.
	}
*/
public class GradeIfTest1 {

	public static void main(String[] args) {
		/*Book 116 예제코드
		 	1.학생 성적을 Local V로 초기화
		 		int grade로 
		 		값은 그때마다 다른 성적을 입력 받아야 하기에 Scanner사용
		 	2. 만약에 성적이 90점 이상...A Grade
		 					80~90점...B Grade
		 					70~80점...C Grade
		 					나머지 성적 Try Again
		 */
		int grade;
		Scanner sc=new Scanner(System.in);
		System.out.println("학생 성적 입력>>>");
		grade=sc.nextInt();
		if(grade>=90) System.out.println("90점 이상입니다. A Grade입니다.");
		else if(80<=grade&&grade<90) System.out.println("80점 이상90점 이하입니다. B Grade입니다.");
		else if(70<=grade&&grade<80) System.out.println("70점 이상80점 이하입니다. C Grade입니다.");
		else System.out.println("70점 이하입니다.Try Again입니다.");
		sc.close();
	}

}

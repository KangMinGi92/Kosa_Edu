package com.edu.condition.test;

import java.util.Scanner;
/*
	Book 117 예제코드
*/
public class GradeIfTest2 {

	public static void main(String[] args) {
		//해당 코드를 실행할때마다 자동으로 학생성적이 랜덤하게 입력됨
		//성적의 범위가 50~100점 사이의 점수가 랜덤하게 입력되도록 코드를 작성
		int grade=(int)(Math.random()*51)+50;
		System.out.println(grade);
		if(grade>=90) System.out.println("90점 이상입니다. A Grade입니다.");
		else if(80<=grade&&grade<90) System.out.println("80점 이상90점 이하입니다. B Grade입니다.");
		else if(70<=grade&&grade<80) System.out.println("70점 이상80점 이하입니다. C Grade입니다.");
		else System.out.println("70점 이하입니다.Try Again입니다.");
	}

}

package com.edu.capsulation.test;
/*
 	Encapsulation 코드 작성 패턴
 	1. 필드 앞 ---> private
 	2. void setXxx(o,o,o) ---> public
 		Xxx getXxx() ---> public
 	3. setXxx() 메소드에서 필드초기화 하기 직전에
 		타당한 값만 필드에 할당되도록 제어문을 달아준다
 		
 		"필드는 소중하니깐~!!!!"
 */
import java.util.Scanner;

import com.edu.capsulation.MyDate;

public class MyTest {
/*
 	월,일에 해당하는 값을 Scanner로 입력
 */
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		MyDate md = new MyDate();
//		md.month=33;
//		md.day=13;
//		md.setMonth(33);
//		md.setDay(13);
		System.out.println("해당 월과 일을 입력해 주세요");
		int month=sc.nextInt();
		int day=sc.nextInt();
		md.setMonth(month);
		md.setDay(day);
		if(md.getMonth()!=0 && md.getDay()!=0)
		System.out.println("오늘은 "+md.getMonth()+" 월 "+ md.getDay()+" 일입니다.!!");
//		md.setMonth(sc.nextInt());
//		if(md.getMonth()!=0)md.setDay(sc.nextInt());
//		if(md.getDay()!=0)System.out.println("오늘은 "+md.getMonth()+" 월 "+ md.getDay()+" 일입니다.!!");
	}
}

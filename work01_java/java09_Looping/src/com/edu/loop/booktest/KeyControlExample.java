package com.edu.loop.booktest;

import java.util.Scanner;

public class KeyControlExample {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		boolean run=true;
		int speed=0;
		
		while(run) {
			System.out.println("------------------");
			System.out.println("1. 증속 | 2. 감속 | 3. 중지");
			System.out.println("------------------");
			System.out.print("선택 : ");
			
			String strNum=sc.next();
			
			if(strNum.equals("1")) {
				speed++;
				System.out.println("현재속도 = "+speed);
			}else if(strNum.equals("2")) {
				speed--;
				System.out.println("현재속도 = "+speed);
			}else run=false;
		}
		System.out.println("프로그램 종료");
	}

}

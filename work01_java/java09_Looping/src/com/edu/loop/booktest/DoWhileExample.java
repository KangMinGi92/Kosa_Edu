package com.edu.loop.booktest;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		System.out.println("메세지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요.");
		
		Scanner sc= new Scanner(System.in);
		String inputString="";
		do {
			System.out.print("입력 값 : ");
			inputString=sc.nextLine();
			System.out.println(inputString);
		}while(!inputString.equals("q"));
		System.out.println("프로그램을 종료합니다.");
	}
		
}

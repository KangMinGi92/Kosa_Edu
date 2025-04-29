package com.edu.array.test1;

import java.util.Scanner;

public class BasicArrayTest4 {

	public static void main(String[] args) {
		// 1.String Type의 names 배열을 생성하세요
		// 2.박성우,이윤열,이민호,김선호
		// 3.for문 과 Scanner를 사용하여 배열에 입력하세요
		// 4.모든 이름을 출력

		Scanner sc = new Scanner(System.in);
		System.out.println("1. 배열의 사이즈를 입력 >>");
		int size = sc.nextInt();
		
		System.out.println("2. String 타입의 배열 생성 >>");
		String[] names = new String[size];
		
		System.out.println("3. 배열 초기화 >>");
		for(int i=0; i<names.length;i++) {
			System.out.print("이름 : ");
			names[i] = sc.next();
		}
//		int i = 0;
//		for (String name : names) {
//			System.out.print("이름 : ");
//			names[i++] = sc.next();
//		}
		System.out.println("4. 정보 출력 >>");
		for (String name : names) System.out.print(name+" ");
	}
}

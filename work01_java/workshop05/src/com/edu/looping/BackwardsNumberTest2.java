package com.edu.looping;

import java.util.Scanner;

public class BackwardsNumberTest2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num=0;
		System.out.print("1이상의 숫자를 입력하세요 : ");
		while (true) {
			num = sc.nextInt();
			if (num < 1) {
				System.out.println("1이상의 숫자를 입력해주세요.!!");
				System.out.print("1이상의 숫자를 입력하세요 : ");
			} else
				break;
		}
		for (int i = num; i > 0; i--)
			System.out.print(i + " ");

		sc.close();

	}
//		Scanner sc = new Scanner(System.in);
//		System.out.print("1이상의 숫자를 입력하세요 : ");
//		int num = sc.nextInt();
//		while (num<=0) {
//			System.out.println("1이상의 숫자를 입력해주세요.!!");
//			System.out.print("1이상의 숫자를 입력하세요 : ");
//			num=sc.nextInt();
//		}
//		for (int i = num; i > 0; i--) System.out.print(i + " ");
//
//		sc.close();
//	}
}

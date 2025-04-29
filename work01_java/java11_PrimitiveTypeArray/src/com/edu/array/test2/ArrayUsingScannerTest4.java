package com.edu.array.test2;

import java.util.Scanner;

public class ArrayUsingScannerTest4 {

	public static void main(String[] args) {
		int studentNum = 0;
		int[] scores = null;
		boolean run = true; // flag 값

		Scanner sc = new Scanner(System.in);
		while (run) {
			System.out.println("----------------------------------------------------");
			System.out.println("1.학생수 | 2. 점수 입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("----------------------------------------------------");
			System.out.print("메뉴선택 > ");
			int menu = sc.nextInt();
			switch (menu) {
			case 1:
				studentCount();
				break;
			case 2:
				System.out.println("학생 성적 입력 >>");
				int idx = 0;
				for (int score : scores) {
					System.out.println(idx + 1 + " 번 학생 성적 입력");
					scores[idx++] = sc.nextInt();
				}
				break;
			case 3:
				System.out.println("학생 성적 리스트입니다.");
				for (int score : scores)
					System.out.print(score + " ");
			case 4:
				// 최고점수
				// 평균점수
				int max = 0;
				int sum = 0;
				double avg = 0;
				for (int score : scores) {
//					if (max < score) max = score; 삼항연산자가 더 깔끔하게 코딩가능하게 해준다.
					max = (max < score) ? score : max;
					sum += score;
				}
				avg = (double) (sum / studentNum);
				System.out.println("최고점수 => " + max);
				System.out.println("평균점수 => " + avg);
				break;
			case 5:
				// 프로그램을 종료합니다..
				run = false;

			}// switch
		} // while
		System.out.println("프로그램을 종료합니다..");
	}// main

	private static void studentCount() {
		System.out.println("학생수 입력 >>");
		Scanner sc = new Scanner(System.in);
		int[] scores = new int[sc.nextInt()];
	}
}// class

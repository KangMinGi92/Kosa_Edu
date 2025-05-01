package test;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int pacto = 1;
		for (int i = 1; i <= a; i++) {
				pacto *= i;
		}
		System.out.println(pacto);

	}// main
	/*
	 * 
	 * 첫째 줄에 두 도메인의 유명도 N과 M이 주어진다. (-2,000,000,000 ≤ N, M ≤ 2,000,000,000)
	 */
}// class

package com.edu.loop.test;

/*
 	1~100까지의 총합을 구하는데 홀수값만의 총합을 구하세요
*/
public class LoopingContinueTest3 {

	public static void main(String[] args) {
		// sum는 for문 밖에서 선언, 기본값을 부여!!!
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0)
				continue;
			sum += i;
		}
		System.out.println("총합=>" + sum);
		System.out.printf("1부터 100까지 홀수값의 총합 %d", sum);
	}
}

package com.edu.array.test1;

public class BasicArrayTest3 {

	public static void main(String[] args) {
		// 1.
		int[] scores = { 86, 92, 94, 78, 80, 76 };
		// 2. 성적들의 총점
		int sum = 0;
		for (int score : scores)
			sum += score;
		// 3. 평균성적
		System.out.println("총점 => "+sum);
		System.out.println("평균 => "+sum / scores.length);
	}
}

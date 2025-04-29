package com.edu.loop.test;

//Book 126...참고
//1~100까지의 총합을 구해서 출력
public class LoopingBreakTest2 {

	public static void main(String[] args) {
		//sum는 for문 밖에서 선언, 기본값을 부여!!!
		int sum = 0;
		for (int i = 1; i < 101; i++) {
			sum += i;
			if(sum>=500) break; //반복문 안에서 반복을 멈출때는 if키워드와 함께 break키워드를 사용해서 반복을 멈춘다.
		}
		System.out.println("총합=>"+sum);
	}

}

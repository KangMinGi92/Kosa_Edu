package com.edu.array.test2;

public class ArrayMaxAndMinTest3 {

	public static void main(String[] args) {
		int[] scores= {79,88,91,45,100,56};
//		int max = 0;
//		int min = 0;
		int max = scores[0]; //배열의 첫번째 값으로 최대값을 초기화 한다.
		int min = scores[0]; //배열의 첫번째 값으로 최소값을 초기화 한다.
		
		for(int i : scores) {
			if(i>max) max =i;
			if(i<min) min =i;
		}
		System.out.println("최대값 => "+max);
		System.out.println("최소값 => "+min);
	}
}

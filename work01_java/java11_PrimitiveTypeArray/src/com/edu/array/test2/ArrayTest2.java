package com.edu.array.test2;

public class ArrayTest2 {

	public static void main(String[] args) {
		//1. members1 선언 + 생성 + 초기화
		//2. members2 선언 + 생성 + 초기화
		//3. System.arraycopy()로 members2배열 값 변경
		//4. members2 정보 출력
		int[] members1 = {1,2,3,4,5,6};
		int[] members2 = {10,11,12,13,14,15,16,17,18,19};
		
		System.arraycopy(members1, 0, members2,members2.length-members1.length, members1.length);
		for(int member : members2) System.out.print(member+" ");
		
	}
}

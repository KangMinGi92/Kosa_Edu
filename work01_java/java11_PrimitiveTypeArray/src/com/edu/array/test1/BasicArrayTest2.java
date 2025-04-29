package com.edu.array.test1;

public class BasicArrayTest2 {

	public static void main(String[] args) {
		// arr이라는 int타입의 배열을 생성..11,22,33값을 가지는
		// 선언+생성+초기화
		int[] arr = { 11, 22, 33 };
		// for문으로 배열안의 정보를 출력
//		System.out.println(arr);
////		for (int i = 0; i <arr.length; i++)
////			System.out.print(arr[i] + " ");
//		
//		//뭐가 어디에서 돌아가는가?
//		for(int i : arr) {
//			System.out.print(i); // 11,22,33
//			
		int idx=0;
		for(int data : arr) {
			arr[idx++]=data+10;
		}
		for(int data : arr) {
			System.out.println(data);
		}
		}
	}


package com.edu.array.test1;

/*
 * Array(배열)
 * 	SameDataType을 가지는 서로다른 값들이 하나의 변수를 통해서 한방에 처리되는 것
	int a = 1;
	int b = 2;
	int c = 3;
	int d = 4;
	.
	.
	.
	int xx = 100;
	배열의 종류
	1.Primitive DataType Array
	2.Reference DataType Array
	Primitive DataType Array 배열의 생성 방법
		1. 선언 
			int[]arr;
		2. 생성
			1) new키워드를 통해서 생성
			2) size를 명시
			arr = new int[3];
			
			ex) 선언+생성 한번에
			int[] arr = new int[3]; 
		3. 초기화
			arr[0] = 11; arr[1] = 22; arr[2] = 33;
		
			ex) 선언+생성+초기화 한번에 하는방법
			int[] arr = {11,22,33};
	2.Reference DataType Array
	Reference DataType Array배열의 생성 방법
		1. 선언
			Account[] accounts;
		2. 생성
			accounts=new Accounts[3];
		3. 선언+생성+초기화
			Account[] accounts={new Account(),new Account(),new Account()};
	
 */
public class BasicArrayTest1 {

	public static void main(String[] args) {
		// 1. int[] arr을 선언
		int[] arr;
		// 2. arr을 생성... 사이즈는 3
		arr = new int[3];
		// 3. 배열의 주소값을 출력
		System.out.println(arr);
		for (int i = 0; i < 3; i++) {
			System.out.print(arr[i] + " ");// 0,0,0 arr의 type에 해당하는 int의 초기값 0이 출력
		}
		// 4. 각각 배열의 요소에 11, 22, 33 을 입력
		arr[0] = 11;
		arr[1] = 22;
		arr[2] = 33;
		// 5. for문을 이용해서 arr배열에 들어 있는 값들을 출력
		for (int i = 0; i < 3; i++) {
			System.out.print(arr[i] + " ");// 11,22,33 arr의 대입한 값 출력
		}
	}

}

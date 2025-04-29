package com.edu.datatype.test;

public class DataTypeTest {
	int c ;
	public static void main(String[] args) {
		DataTypeTest t=new  DataTypeTest();
		t.c =200;
		byte a = 100; // a 는 로컬변수 100은 리터럴(실제값)
		//127까지의 값의 범위를 가진다.
//		byte b = 128;
		int b = 128;
		System.out.println("a==>"+a);
		System.out.println("a==>"+b);
		//long, float, double 타입은 값뒤에 무조건 데이터 타입이 생략되어져 있다.
		//값비교 이전에 타입을 먼저 비교한다.
//		float salary = 300.34;
		float salary1 = 300.34f;
		double salary2 = 300.34;
		long salary3 = 200L;
		//================================================================
		short x,y,c;
	
		x=1; y=2;
		//실제값이 아니기 떄문에 타입 비교가 된다.
		//이때 사칙연산이 적용되면 int로 형이 승격된다.
		c=(short)(x*y);
		
		
	}

}

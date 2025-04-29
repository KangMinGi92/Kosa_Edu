package com.edu.constructor.test;

import com.edu.constructor.Shirt;

public class ShirtTest {

	public static void main(String[] args) {
		//1. 객체생성
//		Shirt longT = new Shirt();
//		Shirt shortT = new Shirt();
//		Shirt t = new Shirt();
//		System.out.println(longT.getDetails()); set를 이용하지 않아서 기본값이 대입되어있음
		
		
		//생성자를 이용하여 인자값을 가진 객체를 만들어라.
		Shirt test=new Shirt();
		Shirt longT = new Shirt("나이키",100,true);
		Shirt shortT = new Shirt("아디다스",100,false);
		Shirt t = new Shirt("코오롱",110,false);
		
		System.out.println(longT.getDetails());
		System.out.println(shortT.getDetails());
		System.out.println(t.getDetails());
	}

}

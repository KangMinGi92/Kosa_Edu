package com.edu.child;

import com.edu.parent.Parent;

public class Child extends Parent {
	//자식만의 메소드
	public void childAccess() {
		System.out.println(publicField+", "+protectedField);
		System.out.println("defaultField, pirvateField 접근할 수 없어요!!!");
	}
	
	@Override
	/*
	 	1step : 부모의 메소드를 물려받는다.
	 	2step : 물려받은 메소드를 고쳐쓴다.
	 */
	public void access() {
		super.access();
		//추가... 고쳐쓴다.
		System.out.println("부모에 접근가능한 필드 :: "+ publicField);
		System.out.println("부모에 접근가능한 필드 :: "+ protectedField);
	}
}

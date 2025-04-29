/*
 	package 선언부는 클래스의 가장 윗부분에 온다
 	package 뒤에 나오는 이름들은 다 소문자
 	상위 패키지와 하위 패키지는 . 로 구분한다
 	(파일시스템하고 패키지시스템의 차이는 파일시스템은 상위 하위 구분을 /로 하고, 패키지 시스템은 .으로 한다)
 	패키지 레벨은 3개 이상이 기본이다. ex) com.edu.method;
 */
package com.edu.method;

import java.util.Date;

public class Employee {
	//Field(멤버변수)와 Local Variable(지역변수)를 구분하는 기준은 변수가 선언된 위치이다.
	//Field는 class 선언된 부분 바로 아래 선언
	//Local Variable는 method매개변수나 지역안에 선언
	public String name;
	public String address;
	public Date hiredate;
	
//	public void printEmployee() {
//		System.out.println(name+" , "+address+" , "+hiredate);
//	}
	public String getEmployee() {
		return name+" , "+address+" , "+hiredate;
}
	//필드초기화 기능을 추가
	/*
	 	this : 클래스 자기 자신을 의미함.
	 	ex) this.name --> class의 Field(멤버변수)인 name
	 */
	public void setEmployee(String name, String address, Date hiredate) {
		this.name=name;
		this.address=address;
		this.hiredate=hiredate;
	}
}

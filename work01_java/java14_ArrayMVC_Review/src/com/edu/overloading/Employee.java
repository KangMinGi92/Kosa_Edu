package com.edu.overloading;
/*
 	직원에 대한 정보를 저장하는 클래스
 */
public class Employee {
	private int empno;
	private String name;
	private double salary;
	private String address;
	
	/////////////필드 기본값 설정 ///////////////////
	public static final String DEFAULT_NAME = "홍길동";
	public static final double BASIC_SALARY = 100.0;
	public static final String DEFAULT_ADDRESS = "서울시";
	
	/*
	 * 화면으로부터 입력된 필수정보만으로 vo객체를 생성하려면 생성자 오버로딩에 대한 이해와 사용법을 반드시 알아야한다. Employee 생성자는
	 * 3개 생성자명은 동일 / 인자값 리스트는 서로 다르다. --> 생성자 오버로딩
	 * 
	 * 필수값만으로 객체를 생성할때 사용 나머지 필드는 초기화가 안되어서 기본값으로 진행될 것이다. 결과적으로 데이터베이스 테이블 컬럼에 기본값이
	 * 들어갈 것이다.
	 */
	
	public Employee(int empno) {
//		this.empno = empno;
		this(empno, DEFAULT_NAME, BASIC_SALARY, DEFAULT_ADDRESS); //this()는 내가 가진 생성자 호출!!!
	}

	public Employee(int empno, String name, double salary, String address) {
		this.empno = empno;
		this.name = name;
		this.salary = salary;
		this.address = address;
	}

	public Employee(int empno, String name) {
		this(empno, name, BASIC_SALARY, DEFAULT_ADDRESS);
	}

	public String getDetails() {
		return empno + ", " + name + ", " + salary + ", " + address;
	}
	/*
	 	클라이언트가 회원가입, 혹은 회원검색 서비스를 서버에 요청할 수 있다.
	 	이때 여러명의 클라이언트가 서비스를 아무리 많이 요청한다고 해도 EmployeeService 인스턴스는 오직 단, 하나만 생성 되어야 한다.
	 	이유는 서비스 요청과 연결되는 것은 클래스의 메소드이기 때문이다.
	 	
	 	즉, 회원가입이 10번 일어나도 EmployeeService 객체는 단 하나만 생성되고, 그 안에 addEmployee 메소드만 10번 호출된다.
	 	이때 서로다른 정보를 가지는 vo가 생성되고 함수가 호출될때 인자값으로 넘겨진다.
	 	
	 	하나의 클래스를 통해서 단 하나의 객체만 생성되도록 강제하는 패턴을 '싱글톤 패턴' 이라고 한다.
	 	
	 	★ 클라이언트 요청이 있기 전 EmployeeService객체는 이미 메모리에 한번 올라가 있다...(즉 class는 Process 단위로 이해하자)
	 	★ 회원가입 요청이 있으면 EmployeeService 클래스 안에 addEmployee메소드가 요청을 수행 한다...(즉 class안에 method는 Thread 단위로 이해하자)
	 	=> 회원가입이 다 끝나면(서비스를 수행이 끝나면)메소드는 메모리에서 자동으로 소멸된다.(Thread는 Death 된다.!!)
	 */
}

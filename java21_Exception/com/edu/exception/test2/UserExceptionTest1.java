package com.edu.exception.test2;

/*
 	예외를 처리하는 방법2
 		1) try~catch :: 즉각적으로 폭탄을 바로 처리
 		2) throws	 :: 폭탄을 던진다... method 선언부에서 발생한 폭탄을 던진다.
 */
public class UserExceptionTest1 {

	public static void main(String[] args) {
		User user = new User();
		System.out.println("1. go() calling.....");
		try {
			user.go();
		} catch (ArithmeticException e) {
			System.out.println("잡았다.");
		}
		System.out.println("3. go() finished...");
	}

}
//서비스 클래스에서 try{}catch를 처리하면 코드가 지저분하기 떄문에 throws로 던지고 Main method에서  한번에 처리한다.
class User {
	public void go() throws ArithmeticException {
		System.out.println("2. go() working...");
		int i = 10;
		int j = 0;

		System.out.println("연산적용" + i / j);
	}
}

















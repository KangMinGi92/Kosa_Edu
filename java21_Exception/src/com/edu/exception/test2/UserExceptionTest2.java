package com.edu.exception.test2;
//사용자 정의 Exception => 강력한 프로그램을 제어하는 제어문!!으로 사용된다.
//1. 내가 특정한 조건에서 고의적으로 폭탄을 터트리겠다.(throw new Exception();)
//2. 폭탄을 내가 직접 제조해서 사용하겠다

/*
	회사에서 자주 사용자 정의 Exception 명명법
	
	DuplicateIsbnException
	DuplicateSSNException
	RecordNotFountException
	InvalidTransactionException
*/
//사제폭탄
class ZeroBoom extends Exception {
	public ZeroBoom() {
		this("This is ZeroBoom Exception...");
	}

	public ZeroBoom(String message) {
		super(message);
	}
}

public class UserExceptionTest2 {

	public static void main(String[] args) {
		Users u = new Users();
		try {
			System.out.println("go()를 호출합니다.");
			u.go();
		} catch (ZeroBoom e) {
			System.out.println(e.getMessage());
		}
		System.out.println("이 부분을 수행하고 프로그램을 마칩니다.");
	}
}

class Users {
	public void go() throws ZeroBoom {
		int i = 10;
		int j = 0;
		// 저 아랫부분에서 i를 j로 나누는 연산이 진행된다...
		if (j == 0)
			throw new ZeroBoom("분모가 0이면 안됩니다.~~!!");
	}
}
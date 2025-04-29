package com.edu.array.test;
/*
2.Reference DataType Array
Reference DataType Array배열의 생성 방법
	1. 선언
		Account[] accounts;
	2. 생성
		accounts=new Accounts[3];
	3. 선언+생성+초기화
		Account[] accounts={new Account(),new Account(),new Account()};
*/
import com.edu.array.Account;

public class AccountArrayTest {

	public static void main(String[] args) {

		// 1. Account[ ]의 배열을 생성...사이즈는 3...accounts
		Account[] accounts = new Account[3];
		// 2. 각각의 배열요서에 Account 객체를 생성
		accounts[0] = new Account(111,"Toss",4000.0);
		accounts[1] = new Account(222,"KB",4500.0);
		accounts[2] = new Account(333,"Busan",5000.0);
		// 3. 메모리상에 올라간 Account[] 배열 위치값을 출력
			System.out.println(accounts);
		// 4. 모든 Account 객체 정보를 출력
		for(Account account : accounts) {
			System.out.println(account.getAccountInfo()+" ");
		}
	}

}

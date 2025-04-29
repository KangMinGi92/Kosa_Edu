package com.edu.array;

public class Account {
	private int accNumber;
	private String bankName;
	private double balance;
	
	public Account(){}
	//balance 부분이 생성자에 주입...하나의 통장을 개설할때 특정 금액이상이 반드시 있어야
	//통장이 개설가능하다.
	/*
 	화면으로부터 입력된 필수정보만으로 vo객체를 생성하려면
 	생성자 오버로딩에 대한 이해와 사용법을 반드시 알아야한다.
 */
	public Account(int accNumber,String bankName,double balance){
		this.accNumber=accNumber;
		this.bankName=bankName;
		this.balance=balance;
	}
	public String getAccountInfo() {
		return "\n계좌번호 : "+accNumber+"\n은행이름 : "+bankName+"\n잔액 : "+balance;
	}
	//입금
	public void deposit(double amt) {
		balance+=amt;
	}
	//출금
	public void withdraw(double amt) {
		balance-=amt;
	}
	//잔액
	public double getBalance() {
		return balance;
	}
}

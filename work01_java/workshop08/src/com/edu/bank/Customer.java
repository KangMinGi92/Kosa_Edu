package com.edu.bank;
// Account와 Has a Relation 관계에 있다.

public class Customer {
	//생성자
	private String name;
	private String address;
	private Account account;
	
	public Customer() {}
	public Customer(String name,String address) {
		this.name=name;
		this.address=address;
	}
	public String getName() {
		return name;
	}
	public String getCustomerInfo() {
		return "이름 : "+name+"\n주소 : "+address;
	}	
	public void openAccount(Account account) {
		this.account=account;
	}
	public Account getAccount() {
		return account;
	}
}

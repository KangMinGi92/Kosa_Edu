package self.bank;

public class Account {
	private int balance;

	private static final int BALANCE = 1000;

	public Account() {
		this(BALANCE);
	}

	public Account(int balance) {
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	// 입금 최소금액 1000원이상 , 잔액 이하로 출금 금지,
	public void deposit(int num) {
		if(num<1000) {
			System.out.println("1000원 이상 입금 가능합니다.");
		}else {
			balance+=num;
		}
	}

	public void withdraw(int num) {
		if(balance<num) {
			System.out.println("잔액이 부족합니다.");
		}else {
			balance-=num;
		}
	}

	@Override
	public String toString() {
		return "Account [balance=" + balance + "]";
	}
}

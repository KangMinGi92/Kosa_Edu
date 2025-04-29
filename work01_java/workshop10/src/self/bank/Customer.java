package self.bank;

public class Customer {
	private String name;
	private int ssn;
	private Address address;
	private Account account;
	
	private static final String NAME="가나다";
	private static final int SSN=1000;
	private static final Address ADDRESS=new Address();
	private static final Account ACCOUNT=new Account();
	
	public Customer() {
		this(NAME,SSN,ADDRESS,ACCOUNT);
	}
	public Customer(int ssn) {
		this(NAME,ssn,ADDRESS,ACCOUNT);
	}

	public Customer(String name, int ssn, Address address) {
		this(name,ssn,address,ACCOUNT);
	}

	public Customer(String name, int ssn, Address address, Account account) {
		this.name = name;
		this.ssn = ssn;
		this.address = address;
		this.account = account;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSsn() {
		return ssn;
	}

	public void setSsn(int ssn) {
		this.ssn = ssn;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", ssn=" + ssn + ", address=" + address + ", account=" + account + "]";
	}

}

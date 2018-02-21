package prob05;

public class Account {
	private String accountNo;//계좌번호
	private int balance;//잔고
	
	/**
	 * Constructor
	 */

	public Account(String accountNo) {
		this.accountNo = accountNo;
		System.out.println(this.accountNo + " 계좌가 개설되었습니다.");
	}
	
	/**
	 * getter - setter
	 */
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	/**
	 * methods
	 */
	
	//입금
	public void save(int money) {
		balance += money;
		System.out.println(accountNo + " 계좌에 " + money + "만원이 입금되었습니다.");
	}
	//출금
	public void deposit(int money) {
		if(balance < money) {
			System.out.println("잔액이 부족합니다.");
			return;
		}
		
		balance -= money;
		System.out.println(accountNo + " 계좌에 " + money + "만원이 출금되었습니다.");
	}
}
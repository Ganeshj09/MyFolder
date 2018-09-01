package com.demo.encapsulation;

public class EncapsulationDemo {

	private int balance = 100000;
	private String customername = "Ganesh";
	int FDamount = 300000;
	private int amount = 1000;
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	static String password = "Ramesh";
	public int getBalance(String cn) {
		if (cn == customername) {
			System.out.println("Account balance is"  + balance );
		}else {
			System.out.println("invalid customer name");
		}
		return 0;
	}
	public void setBalance(int balance1,String cn) {
		if (cn == customername) {
			this.balance = balance+balance1; ///this keyword always have instance variable
			System.out.println("Account balance is"  + balance );
		}else {
			System.out.println("invalid customer name");
		}
		//this.balance = balance;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public int getFDamount() {
		return FDamount;
	}
	public void setFDamount(int fDamount) {
		FDamount = fDamount;
	}
	public static String getPassword() {
		return password;
	}
	public static void setPassword(String password) {
		EncapsulationDemo.password = password;
	}

}

/*
 * Author : Sai Chaitanya Krishna
 * Date :29-10-2020
 * Description : Account class which holds the account details
 */
public class Account {
	/**
	 * Account number
	 */
	private long accNum;
	/**
	 * Account Balance
	 */
	private double balance;
	/**
	 * Account Holder
	 */
	private Person accHolder;
	private static int count=1;
	/**
	 * Parameterized Constructor 
	 * @param balance
	 * @param accHolder
	 */
	public Account(double balance,Person accHolder) {
		this.balance=balance;
		this.accHolder=accHolder;
		count+=1;
		this.accNum=count;
	}
	/**
	 * Getters and Setters
	 * @return
	 */
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public Person getAccHolder() {
		return accHolder;
	}
	public void setAccHolder(Person accHolder) {
		this.accHolder = accHolder;
	}
	/**
	 * Method that add amount to initial balance
	 * @param amount
	 */
	public void deposit(double amount) {
		this.balance=this.getBalance()+amount;
	}
	/**
	 * Method to withdraw amount from the available balance 
	 * @param amount
	 */
	public void withdraw(double amount) {
		double newBalance=this.getBalance()-amount;
		this.setBalance(newBalance);
	}
}

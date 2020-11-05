/*
 * Author : Sai Chaitanya Krishna
 * Date :29-10-2020
 * Description : Class Savings account to check the withdraw amount is less than minimum balance or not
 */
public class SavingsAccount extends Account{
	private final double MINIMUM_BALANCE = 500;

	public SavingsAccount(double amount, Person person) {
		super(amount, person);
	}
	/**
	 * method to check withdraw amount exceeding minimum balance or not
	 */
	public void withdraw(double amount) {
		double newBalance=super.getBalance()-amount;
		if(newBalance>=MINIMUM_BALANCE) {
			super.setBalance(newBalance);
		}
		else {
			System.out.println("The account balance is"+this.getAccHolder().getName()+" less than the minimum balance "+MINIMUM_BALANCE);
		}
		
	}
}
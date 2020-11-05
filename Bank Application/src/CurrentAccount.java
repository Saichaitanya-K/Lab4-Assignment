/*
 * Author : Sai Chaitanya Krishna
 * Date :29-10-2020
 * Description : Class Current Account to check the withdraw amount is exceeding overdraft limit
 */
public class CurrentAccount extends Account {
	private double overDraftLimit;
	public CurrentAccount(double balance, Person accHolder,double overDraftLimit) {
		super(balance, accHolder);
		this.overDraftLimit=overDraftLimit;
	}
	/*
	 * withdraw method is overridden here to perform the withdrawal by overDraft
	 * limit
	 */
	public void withdraw(double amount) {
		double balance, newBalance;
		balance = getBalance();
		/*
		 * Calculating balance with overdraft limit
		 */
		if (amount <= overDraftLimit) {
			newBalance = balance - amount + overDraftLimit;
			setBalance(newBalance); 		// Setting balance after calculating 
			System.out.println("Balance after withdrawal " + newBalance);
		} else {		//if amount is less than overdraft limit prints messsage
			System.out.println("Sorry! Could not process your withdrawal request");
		}
	}

}

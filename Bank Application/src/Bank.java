/*
 * Author : Sai Chaitanya Krishna
 * Date :29-10-2020
 * Description : Class Bank to give input and getting respective output
 */
import java.util.*;
public class Bank {

	public static void main(String[] args) {
		/**
		 * Creating Person object of smith
		 */
		Person smith=new Person();
		smith.setName("smith");
		/**
		 * Creating Person object with of kathy
		 */
		Person kathy=new Person();
		kathy.setName("kathy");
		/**
		 *  Creating Account object of smith and passing balance and name as parameters
		 */
		Account smithAccount=new Account(2000,smith);
		/**
		 *  Creating Account object of kathy and passing balance and name as parameters
		 */
		Account kathyAccount=new Account(3000,kathy);
		/**
		 * Displaying smith and kathy initial account balance
		 */
		System.out.println("Intial Smith account balance is : "+smithAccount.getBalance());
		System.out.println("Intial kathy account balance is : "+kathyAccount.getBalance());
		/**
		 * Depositing 2000 to smith account
		 */
		smithAccount.deposit(2000);
		/**
		 * Withdraw 2000 from kathy account
		 */
		kathyAccount.withdraw(2000);
		/**
		 * Displaying account balance after the changes
		 */
		System.out.println("Smith account balance after deposit is : "+smithAccount.getBalance());
		System.out.println("Kathy account balance after withdraw is : "+kathyAccount.getBalance());
		/**
		 * Savings account object of smith
		 */
		SavingsAccount smithSavings=new SavingsAccount(smithAccount.getBalance(),smith);
		/**
		 * Withdraw of 3000 from smith savings account
		 */
		smithSavings.withdraw(3000);
		System.out.println("Smith account balance after withdraw is : "+smithSavings.getBalance());
		/**
		 * Current account object of kathy
		 */
		CurrentAccount kathyCurrent = new CurrentAccount(kathyAccount.getBalance(), kathy,500);

		/*
		 *Withdraw of 2000 from kathy current account
		 */
		kathyCurrent.withdraw(2000);
		
		System.out.println("Kathy account balance after withdraw is : "+kathyCurrent.getBalance());
	}

}

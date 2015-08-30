package Jenkins.deployment.lzyk9999;

public class BankAccount {

	  private double balance;

	  public BankAccount(double balance) {
	    this.balance = balance;
	  }

	  public double debit(double amount) {
	    if (balance < amount) {
	      amount = balance;
	    }

	    balance -= amount;
	    return amount;
	  }

	}